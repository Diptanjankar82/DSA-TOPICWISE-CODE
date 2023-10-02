//Sort a linked list of 0s and 1s.
//Given a linked list consisting of only 0 and 1, sort it.
//
//Input Format
//First line contains a single integer N, denoting size of linked list.
//
//Second line contains N space separated integers.
//
//Output Format
//Print the sorted linked list
//
//Example 1
//Input
//
//5
//0 1 0 1 0
//Output
//
//0 0 0 1 1
//Explanation
//
//Sorted linked list would be 0 0 0 1 1
//
//Example 2
//Input
//
//8
//0 1 0 1 0 1 1 0
//Output
//
//0 0 0 0 1 1 1 1
//Explanation
//
//Sorted linked list would be 0 0 0 0 1 1 1 1
//
//Constraints
//1 < N <=100000
//
//0 <= elements of linked list <= 1



package LinkedList_1;
public class Sort_LL_0s_1s {
    class LinkedListNode  {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data)  {
            this.data = data;
        }
    }
    static LinkedListNode sort01(LinkedListNode head){
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

