package Linkedlist;

/**
 * Created by Prasannakshi on 6/14/2017.
 */
public class removedups {
    public static void main(String args[]){
        ListNode input = new ListNode(1);
        input.next = new ListNode(1);
        input.next.next = new ListNode(2);
        input.next.next.next = new ListNode(2);
        input.next.next.next.next = new ListNode(3);
//        input.next.next.next.next = new ListNode(3);
        ListNode output = removeddups(input);
    }

    private static ListNode removeddups(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode p = head.next;

        while(p != null){
            if(p.val == prev.val){
                prev.next = p.next;
                p = p.next;
                //no change prev
            }else{
                prev = p;
                p = p.next;
            }
        }

        return head;
    }
}
