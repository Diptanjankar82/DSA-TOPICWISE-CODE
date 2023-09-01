
 class Introduction_To_LinkedList {

    //Problem Statement -- Convert Array to linkedlist

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public class Solution {
        public static Node constructLL(int []arr) {
            Node head = new Node(arr[0]);
            Node temp = head;
            for(int i =1; i<arr.length; i++){
                Node currNode = new Node(arr[i]);
                temp.next= currNode;
                temp= temp.next;

            }
            return head;
        }
    }
}


