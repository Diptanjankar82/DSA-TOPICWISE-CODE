package Stacks;

import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack <Integer> rt= new Stack<>();
        int x = st.size();
        System.out.println(x);

//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//
//        Stack<Integer> ct = new Stack<>();
//           while (rt.size()>0){
//               ct.push(rt.pop());
//           }
//        System.out.println(st);
    }
}
