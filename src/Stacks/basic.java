package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();
        int n ;
        System.out.println("Enter the number of element you want to insert in stack");
        n = sc.nextInt();
        System.out.println("Enter the element");
        for(int i =0; i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
