public class Basicll {
                             //DISPLAY WITH RECURSIVELY
 public static void displayres(Node head){
//      if(head == null) return;
//
//          System.out.print(head.data + "->");
//
//          displayres(head.next);
    }

                             //LENGTH OF LINKED-LIST;

    public static int length(Node head){
       int count = 0;
       while( head != null){
           count++;
           head = head.next;
       }
       return count;
    }



                               //Display in Function

    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public  static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(1);// haed Node
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);//Tail Node

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayres(a);
        int len = length(a);
        System.out.println(len);


                            //Displaying the LinkList; with FOR LOOP AND WHILE LOOP
        Node temp = a;

                                      //FOR LOOP

//        for(int i = 1; i<=5;i++){
//            System.out.print(temp.data +" ");
//            temp = temp.next;
//        }

                                    //While Loop

//        while (temp!=null){
//            System.out.print(temp.data+ "->");
//            temp = temp.next;
//        }



    }
}
