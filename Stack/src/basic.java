import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(8);

        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
