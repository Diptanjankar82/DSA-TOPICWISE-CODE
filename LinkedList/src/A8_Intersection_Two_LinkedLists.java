//Find intersection of Two Linked Lists

        //Problem Statement: Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.


//TC - O(N + M)
//SC - 0(1)
public class A8_Intersection_Two_LinkedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode tempA = headA;
            ListNode tempB = headB;

            int lengthA = 0;
            while (tempA != null) {
                lengthA++;
                tempA = tempA.next;
            }

            int lengthB = 0;
            while (tempB != null) {
                lengthB++;
                tempB = tempB.next;
            }

            tempA = headA;
            tempB = headB;

            if (lengthA > lengthB) {
                int steps = lengthA - lengthB;
                for (int i = 1; i <= steps; i++) {
                    tempA = tempA.next;
                }
            } else {
                int steps = lengthB - lengthA;
                for (int i = 1; i <= steps; i++) {
                    tempB = tempB.next;
                }
            }

            while (tempA != tempB) {
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return tempA;

        }
    }
}