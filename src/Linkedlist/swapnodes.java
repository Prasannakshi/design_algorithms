package Linkedlist;

/**
 * Created by Prasannakshi on 6/18/2017.
 */
public class swapnodes {
    public static void main(String args[]){
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        ListNode output = swapnow(input);
    }

    private static ListNode swapnow(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            ListNode temp = second.next;
            first.next = temp;
            second.next = first;
            current = current.next.next;
        }

        return dummy.next;
    }
//    public ListNode swapPairs(ListNode head) {
//        if ((head == null)||(head.next == null))
//            return head;
//        ListNode n = head.next;
//        head.next = swapPairs(head.next.next);
//        n.next = head;
//        return n;
//    }
}
