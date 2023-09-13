import java.util.*;
public class Stack_Deque {

    static  class Stack{
        Deque<Integer> de = new LinkedList<>();

        public void push(int data){
            de.addLast(data);
        }

        public int pop(){

            return de.removeLast();
        }

        public int peek(){

            return de.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
