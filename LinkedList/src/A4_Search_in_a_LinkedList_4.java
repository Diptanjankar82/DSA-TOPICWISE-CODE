//problem statement = Search in a Linked List

// write code to return 1 if the element k is present in the linked list and 0 if it's not
public class A4_Search_in_a_LinkedList_4 {
    public static class Node {
        int data;
         Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class Solution {
        public static int searchInLinkedList(Node head, int k) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == k) {
                    return 1;
                }
                temp = temp.next;
            }
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}

