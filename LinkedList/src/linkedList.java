public class linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public static Node head;
        public static Node tail;

        public void addFirst(int data) {
            //Step-1 = Create new node
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            //Step-2 = newNode next = head
            newNode.next = head; // here we link one node to another node

            //step-3 -- head = newNode
            head = newNode;

        }

        public void addLast(int data) {
            //step-1
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            //step-2
            tail.next = newNode;
            //step-3
            tail = newNode;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }



        public static void main(String[] args) {
            linkedList ll = new linkedList();
            ll.print();
            ll.addFirst(2);
            ll.print();
            ll.addFirst(1);
            ll.print();
            ll.addLast(3);
            ll.print();
            ll.addLast(4);

            ll.print();
        }
    }

