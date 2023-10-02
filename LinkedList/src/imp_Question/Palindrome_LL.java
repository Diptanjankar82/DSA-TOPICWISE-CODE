package imp_Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome_LL {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            if(head == null && head.next == null){
                return false;
            }

            ListNode slow = head;
            ListNode fast = head;

            //find middle
            while(slow.next != null && fast.next.next != null){
                slow = slow.next;
                fast= fast.next.next;
            }

            //Reverse the secondHalf

            slow.next = reverse(slow.next);

            //compare
            slow = slow.next;
            while(slow.next != null){
                if(head.val != slow.val){
                    return false;
                }
                slow = slow.next;
                head = head.next;

            }
            return true;

        }
        ListNode reverse(ListNode head){
            ListNode pre = null;
            ListNode next = null;
            while(head != null){
                next = head.next;
                head.next = pre; // here i connect to preveious node -->>
                pre = head;
                head = next;
            }
            return pre;
        }
    }
    public static void main(String[] args) {
        Palindrome_LL palindromeLL = new Palindrome_LL();
        Solution solution = palindromeLL.new Solution();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the linked list:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the linked list:");
        ListNode head = null;
        ListNode tail = null;
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            ListNode newNode = palindromeLL.new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        boolean result = solution.isPalindrome(head);
        System.out.println(result);

        scanner.close();
    }

}