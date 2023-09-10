//problem statement -- Given head, the head of a linked list, determine if the linked list has a cycle in it.
//
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//
//Return true if there is a cycle in the linked list. Otherwise, return false.
//Tc  - o(n)
//sc - o(1)
public class A8_LinkedList_Cycle {
    public static void main(String[] args) {

    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            // Check if the linked list is empty, return false if it is
            if (head == null) return false;

            // Check if there's only one node in the linked list, return false in that case
            if (head.next == null) {
                return false;
            }

            // Initialize slow and fast pointers to the head of the linked list
            ListNode slow = head;
            ListNode fast = head;

            // Traverse the linked list using slow and fast pointers
            while (fast != null && fast.next != null) {
                // Move the slow pointer one step at a time
                slow = slow.next;

                // Move the fast pointer two steps at a time
                fast = fast.next.next;

                // If the fast and slow pointers meet, a cycle is detected
                if (fast == slow) {
                    return true;
                }
            }

            // If the traversal completes without detecting a cycle, return false
            return false;
        }
    }
}
