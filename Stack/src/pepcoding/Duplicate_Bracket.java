package pepcoding;
import java.util.*;

public class Duplicate_Bracket {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    System.out.print("true");
                    return;
                } else {
                    while (!st.isEmpty() && st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }

        System.out.print("false");
    }
}

