//Problem Statement: For a given Singly LinkedList, insert a node at the beginning of the linked list.
//
//        Examples:
//
//        Example 1:
//
//        Input: List = 10->20->30->40->null, Node = 0
//        Output: 0->10->20->30->40->null
//        Explanation: Inserted the given node at the beginning of the linked list.
//
//        Example 2:
//        Input: List = 100->200->300->null, Node =700
//        Output: 700->100->200->300->null
//        Explanation: Inserted the given node at the beginning of the linked list.


//       Time Complexity:  O(1) Because we are just Manipulating the links, which is a constant operation.
//
//       Space Complexity: O(1) We are not using any extra space.

public class Insert_Node_at_beginning_of_LinkedLL_2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public class Solution
    {
        public static Node insertAtFirst(Node list, int newValue) {
            // Write your code here
            Node newhead = new Node(newValue);

            newhead.next = list;
            return newhead;
        }

    }

}
