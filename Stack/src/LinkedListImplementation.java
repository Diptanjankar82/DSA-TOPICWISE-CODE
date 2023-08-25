public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;

        Node (int val){
            this.val = val;
        }
    }
    public static class LLstack{
       Node head = null;
       int size = 0;

       void push(int x){
           Node temp = new Node(x);
           temp.next= head;
           head = temp;
           size++;
       }
       void displayrec(Node h){
           if(h==null) return;
           displayrec(h.next);
           System.out.print(h.val+" ");
       }
       void display(){
           displayrec(head);
           System.out.println();
       }
       void displayRev(){
           Node temp = head;
           while(temp!=null){
               System.out.print(temp.val+" ");
               temp = temp.next;
           }
           System.out.println();
       }
       int size(){
           return size;
       }
       int pop(){
          if(head == null){
              System.out.print("Stack is Empty");
              return -1;
          }
          int x = head.val;
          head = head.next;
          return x;
       }
       int peek(){
           if(head == null){
               System.out.print("Stack is Empty");
               return -1;
           }
           return head.val;
       }
       boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
       }

    }

    public static void main(String[] args) {
        LLstack st = new LLstack();
        st.push(4);
        st.display();//4
        st.push(5);
        st.display();//4 5
        st.push(6);
        st.display();//4 5 6
        System.out.println(st.size());//3
        st.pop();
        st.display();
        System.out.println(st.size());

    }
}
