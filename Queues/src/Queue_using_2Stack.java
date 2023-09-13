import java.util.Stack;

public class Queue_using_2Stack {
    static class Queue{
       static Stack<Integer> S1 = new Stack<>();
       static Stack<Integer> S2 = new Stack<>();

       public static boolean isEmpty(){
           return S1.isEmpty();
       }


       //add = 0(n) = because 2 while loop used
       public static void add(int data){
           while(!S1.isEmpty()){
               S2.push(S1.pop());
           }
           S1.push(data);

           while (!S2.isEmpty()){
               S1.push(S2.pop());
           }
       }

       //remove = 0(1)
       public static int remove(){
           if(isEmpty()){
               System.out.println("empty queue");
               return -1;
           }
           return S1.pop();
       }

       //Peek - 0(1)
       public static int peek(){
           if(isEmpty()){
               System.out.println("empty queue");
               return -1;
           }
           return S1.peek();
       }
    }



    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
