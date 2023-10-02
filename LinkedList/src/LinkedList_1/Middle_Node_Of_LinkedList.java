//Middle Node Of Linked List
//Given the head of a linked list, return the middle node of the linked list.
//
//Linked List Structure:
//
//public class Node
//{
//    int data;
//    Node next;
//    Node(int d) {data = d; next = null; }
//}
//public class LinkedList
//{
//    Node head;
//    Node tail;
//}
//Note:- You just need to complete midpointOfLinkedList() function and return the mid point. The driver code will print the second half of the linked list.
//
//Example:
//
//If your list is [5, 4, 3, 2], the function should return the node at index 2, i.e. value 3.
//
//Input Format
//You will be provided with an integer n, the number of elements in the linked list.
//
//The next n integers denote the values of the nodes in the linked list.
//
//Output Format
//Print the linked list starting from the middle node.
//
//Example 1
//Input
//
//4
//5 4 3 2
//Output:
//
//3 2
//Example 2
//Input
//
//3
//5 7 1
//Output:
//
//7 1
//Constraints
//1 <= n <= 10^5


package LinkedList_1;

import java.util.Scanner;

public class Middle_Node_Of_LinkedList {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist = new LinkedList();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            llist.addToTheLast(new Node(a));
        }

        Solution A = new Solution();
        llist.head = A.midpointOfLinkedList(llist.head);
        llist.printList();

    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class LinkedList {
        Node head;
        Node tail;

        public void addToTheLast(Node node) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    static class Solution {
        static Node midpointOfLinkedList(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
    }
}



