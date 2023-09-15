//Problem statement -- Implement Queue using stack - Dequeue O(1)
//Implement Queue using two stack S1 and S2. You need to complete the push and pop function of Queue class. You are given 2 types of query 1 for push an integer into queue and 2 for enqueue the value from the queue and print.
//
//Note: implement deQueue in O(1)
//Input Format
//First line contains q of queries.
//
//Followed by q lines.
//
//Query of type 1 is followed by an integer x to push element in the queue.
//
//Query of type 2 is for dequeue the last value from the queue and print.
//
//Output Format
//Print the value for dequeue operations in the query given.
//
//Example 1
//Input
//
//5
//1 2
//1 3
//2
//1 4
//2
//Output:
//
//2 3

import java.io.*;
import java.util.*;

class Queue_using_stack
{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Function to push an element in the queue by using 2 stacks.
    void Push(int x)
    {
        stack1.push(x);
    }

    // Function to pop an element from the queue by using 2 stacks.
    int Pop()
    {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            return -1; // Queue is empty
        }

        return stack2.pop();
    }



    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        Queue_using_stack s = new Queue_using_stack();
        int q = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();

        while (q > 0) {
            int QueryType = sc.nextInt();
            if (QueryType == 1) {
                int a = sc.nextInt();
                s.Push(a);
            } else if (QueryType == 2) {
                ans.add(s.Pop());
            }
            q--;
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}

