import java.util.Stack;

public class PushAtBottomRec {
    public static void pushRec(Stack<Integer> st,int idx, int num, int n){
        if (idx == 0) {
            st.push(num);
            return;
        }

        if (st.isEmpty() || idx < 0 || idx > n) {
            throw new IllegalArgumentException("Invalid index");
        }

        int topElement = st.pop();
        pushRec(st, idx - 1, num, n - 1);
        st.push(topElement);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx = 2;
        int num = 99;
        int n = st.size();
        pushRec(st,idx,num,n);

        System.out.println(st);
    }

}
