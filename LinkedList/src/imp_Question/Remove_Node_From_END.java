package imp_Question;

public class Remove_Node_From_END {
    public class ListNode {
     int val;ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i =0; i<= n;i++){
            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

}
