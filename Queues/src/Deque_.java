import java.util.*;
public class Deque_ {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);

    }
}

//AddFirst
//addLast
//removeFirst
//removeLast
