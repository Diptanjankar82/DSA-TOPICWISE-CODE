package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack <Integer> rt= new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
       // System.out.println(rt);


        Stack<Integer> rrt = new Stack<>();
        while(rt.size()>0){
            rrt.push(rt.pop());
        }
       // System.out.println(rrt);

        while(rrt.size()>0){
            st.push(rrt.pop());
        }
        System.out.println(st);
    }
}
