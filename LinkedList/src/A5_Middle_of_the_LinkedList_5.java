//Problem Statement - Find middle element in a Linked List
//Problem Statement: Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.
//
//
//Input Format:
//( Pointer / Access to the head of a Linked list )
//head = [1,2,3,4,5]
//
//Result: [3,4,5]
//( As we will return the middle of Linked list the further linked list will be still available )



//The approach implemented in the given code is called the "Floyd's Tortoise-Hare" algorithm, also known as the "two-pointer technique."

//Tc = o(n/2)
//Sc = o(1)
public class A5_Middle_of_the_LinkedList_5 {
    public class ListNode {
    int val;
     ListNode next;
     ListNode() {}
        ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
  }
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;


            while(fast !=null && fast.next!= null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

}
