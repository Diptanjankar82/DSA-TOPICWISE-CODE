package LinkedList_1;
import java.io.*;
import java.util.*;

public class Remove_Nth_Node_From_EndofList {
        public static Node removeNthFromEnd(Node head, int n) {
            Node temp = new Node(0);
            temp.next = head;
            Node slow = temp;
            Node fast = temp;
            //Write your code here

            for(int i =0; i<n;i++){
                fast = fast.next;
            }

            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return temp.next;
        }
    }

