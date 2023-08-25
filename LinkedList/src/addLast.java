public class addLast {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;


        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void size(){
            System.out.println(size);
            //return size;
        }
        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
                System.out.println();


        }
        void removeElement(){
            if(size ==0){
                System.out.println("lisnkedlist is empty");
            }else if(size == 1){
                head = tail = null;
                size= 0;
            }else{
                head= head.next;
                size--;
            }
        }
        public int getFirstElement(){
            if(size == 0){
                System.out.println("ll is empty");
                return -1;
            }else{
                return head.data;
            }
        }

        public int LastElement(){
            if(size== 0){
                System.out.println("empty");
                return -1;
            }else{
                return tail.data;
            }
        }

        public int getIndex(int idx){   
            if(size ==0){
                System.out.println("empty");
                return -1;
            } else if(idx <0 || idx>=size){
                System.out.println("invalid argument");
                return -1;
            }else{
                Node temp = head;
                for(int i =0; i< idx; i++){
                    temp= temp.next;
                }
                return temp.data;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the linked list
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(90);
        list.removeElement();

        // Displaying the linked list
        list.display();
        list.size();
        list.getIndex(2);
        int elementinx = list.getFirstElement();
        System.out.println(elementinx);


    }
}
