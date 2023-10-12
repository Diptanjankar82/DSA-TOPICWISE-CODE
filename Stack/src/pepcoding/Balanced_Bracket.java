package pepcoding;
import java.util.*;
import java.util.*;

class Solution{
    public void balancedBrackets(String s, int n) {
        // write code here
        Stack<Character> st = new Stack<>();
        for(int i =0; i<n;i++){
            char c = s.charAt(i);
            if(c == '(' || c=='{' || c=='['){
                st.push(c);
            }else if(c==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }else if(c=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }else if(c==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }else{
                System.out.print("NO");
                return;
            }
        }
        if (st.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Solution Obj = new Solution();
        Obj.balancedBrackets(s, n);
    }
}
