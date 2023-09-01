public class BasicllImplementation {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.display();
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAtStart(1);
        ll.display();
        ll.insertAtIndex(2,10);
        ll.display();
        ll.insertAtIndex(0,100);
        ll.display();
        System.out.println(ll.getAt(3));
        ll.deleteAt(2);
        ll.display();
        //ll.display();

        System.out.println(ll.size());
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

        public static class linkedlist {
            Node head = null;
            Node tail = null;

                                //insertAt End in the Linked-list
                                // Tc = 0(1) -- if tail is given
                                // Tc = 0(n) -- if head is given
            void insertAtEnd(int val) {
                Node temp = new Node(val);
                if (head == null) {
                    head = temp;
                } else {
                    tail.next = temp;
                }
                tail = temp;
            }


                                   //insertAt Start in the Linked-list


            void insertAtStart(int val){
                Node temp = new Node(val);
                if(head == null){ // For empty list
                    head = tail = temp;
                    //tail = temp;

                }else{
                    temp.next = head;
                    head = temp;
                }
            }


                                   // Insert at given Index in the Linked-list .....
                                   // Tc= 0(n)
                                   // Sc= 0(1)
            void insertAtIndex(int idx, int val){
                Node t = new Node(val);
                 Node temp = head;
                 if(idx == size()){
                     insertAtEnd(val);
                     return;
                 } else if (idx==0) {
                     insertAtStart(val);
                     return;

                 }

                for(int i =0; i<idx-1;i++){
                     temp= temp.next;
                 }
                 t.next = temp.next;
                 temp.next= t;
            }


                       // Get Element Method : implement a method to return the element at any given index of the Linked-list

            int getAt(int idx){
                Node temp = head;
                for(int i =1; i<=idx;i++){
                    temp = temp.next;
                }
                return temp.data;
            }


                      // Delete-At-Index method : Implement a function to delete a node at a given index
            void deleteAt(int idx){
                if(idx ==0) head = head.next;
                Node temp = head;
                for(int i =1; i<idx-1;i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                // After delete last index make tail to temp;
                tail = temp;
            }
            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + "->");
                    temp = temp.next;
                }
                System.out.println("null");
            }
                           //Size of my linked-list
                           //Tc = 0(n) -- if head is given
                           //Tc = 0(n) -- If class is there
            int size(){
                Node temp = head;
                int count =0;
                while(temp!=null){
                    count++;
                    temp= temp.next;
                }
                return count;
            }

        }
    }

