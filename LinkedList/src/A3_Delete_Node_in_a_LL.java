
//Delete Last Node of Linked List
//        Problem Statement: Given a Singly LinkedList, Delete the Last Node in the LinkedList.
//
//        Examples:
//
//        Example 1:
//        Input: List = 10->20->30->40->null
//        Output: 10->20->30->null
//        Explanation: Deleted the last node of the linked list.
//
//        Example 2:
//        Input: List = 100->200->300->null
//        Output: 100->200->null
//        Explanation: Deleted the last node of the linked list

public class A3_Delete_Node_in_a_LL {
    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Delete_Node_in_a_LinkedList_3 {
        static ListNode head, tail; // head and tail of the LinkedList

        static void PrintList() // Function to print the LinkedList
        {
            ListNode curr = head;
            for (; curr != null; curr = curr.next)
                System.out.print(curr.val + "-->");
            System.out.println("null");
        }

        void InsertatLast(int value) // Function for creating a LinkedList
        {

            ListNode newnode = new ListNode(value);
            if (head == null) {
                head = newnode;
                tail = newnode;
            } else
                tail = tail.next = newnode;
        }

        static void DeleteLast() {
            if (head == null)
                System.out.println("There are no nodes to delete in LinkedList");

            // If there is single node, delete that and make head point to null
            if (head.next == null) {
                head = null;
            } else {

                // step1: Finding First and Second Last Node in LinkedList

                ListNode curr = head, prev = null;
                while (curr.next != null) {
                    prev = curr;
                    curr = curr.next;
                }

                // Step2 : Pointing prev->next to nullptr

                prev.next = null;

            }
        }


//If in case Node given insted of Head

        class Solution {
            public void deleteNode(ListNode node) {
                node.val = node.next.val; //in case of giveen node paramter need to delete simply di one thing given parameter node value put as node,next then it store the value of next node value;

                node.next = node.next.next;
            }
        }
    }
}
