package Stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class NearestSmallerToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        ArrayList<Integer> output = NearestSmallerElement(arr);

        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i) + " ");
        }
    }

    private static ArrayList<Integer> NearestSmallerElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i= arr.length-1;  i >= 0; i--) {
            if (stack.isEmpty()) {
                list.add(-1);
            } else if (stack.size() > 0 && arr[i] > stack.peek()) {
                list.add(stack.peek());
            } else if (stack.size() > 0 && arr[i] <= stack.peek()) {
                while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }

        Collections.reverse(list);

        return list;
    }
}
