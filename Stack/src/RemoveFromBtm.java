import java.util.Stack;

public class RemoveFromBtm {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //System.out.println(st);

        Stack<Integer> rb = new Stack<>();
        while(st.size()>1){
            rb.push(st.pop());
        }
        st.pop();

        while (rb.size()>0){
            st.push(rb.pop());
        }
        System.out.println(st);

    }
}
