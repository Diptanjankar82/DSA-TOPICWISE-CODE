//Remove Duplicates from Sorted List
//You are given the head node of sorted linked list, your task is to delete all duplicates such that each element appears only once, return the head node once you delete duplicate nodes.
//
//Input Format
//The first line of input contains a single integer n.
//
//The second line of input contains n space seperated integer.
//
//Output Format
//Return the head node of linked list after removing duplicates.
//
//Example 1
//Input
//
//3
//1 1 2
//Output
//
//1 2
//Explanation
//
//The linked list given is
//
//1->1->2
//
//after removing the duplicate element we get 1->2
//Example 2
//Input
//
//5
//1 1 2 3 3
//Output
//
//1 2 3
//Explanation
//
//The linked list given are
//
//1->1->2->3->3
//
//after removing duplicate elements we get 1->2->3
//Constraints
//1 <= n <= 300
//
//-100 <= node.value <= 100

package LinkedList_1;
import java.util.*;
public class Remove_Duplicatein_LL {
        public static void main(String[] args) throws Throwable {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            LinkedListNode head = new LinkedListNode(sc.nextInt());
            LinkedListNode a = head;
            for(int i=1;i<n;i++) {
                LinkedListNode temp = new LinkedListNode(sc.nextInt());
                a.next = temp;
                a = temp;
            }
            LinkedListNode ans = Solution.sort01(head);
            for(int i=0;i<n;i++) {
                if(i == n-1) {
                    System.out.println(ans.data);
                }
                else {
                    System.out.print(ans.data + " ");
                }
                ans = ans.next;
            }
        }
    }
class LinkedListNode  {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data)  {
        this.data = data;
    }
}
class Solution {
    static LinkedListNode sort01(LinkedListNode head){
        // Write your code here
        int count0 = 0;
        int count1 = 0;

        LinkedListNode temp =head;
        while(temp != null){
            if(temp.data == 0){
                count0++;
            }else if(temp.data == 1){
                count1++;
            }
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            if(count0 != 0){
                temp.data =0;
                count0--;
            }else if(count1 != 0){
                temp.data = 1;
                count1--;
            }
            temp = temp.next;
        }
        return head;

    }
}

