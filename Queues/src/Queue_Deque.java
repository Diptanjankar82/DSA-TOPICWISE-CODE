import java.util.*;

public class Queue_Deque {
    static class Queue {
        Deque<Integer> de = new LinkedList<>();

        public void add(int data){
           de.addLast(data);
        }

        public int remove(){
          return  de.removeFirst();
        }

        public int peek(){
           return de.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);

        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
