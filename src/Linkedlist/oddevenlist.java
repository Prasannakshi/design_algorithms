package Linkedlist;

/**
 * Created by Prasannakshi on 6/14/2017.
 */
public class oddevenlist {
    public static void main(String args[]){
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);
        input.next.next.next.next.next = new ListNode(6);
        ListNode output = oddeven(input);
    }

    private static ListNode oddeven(ListNode head) {
        if(head == null)
            return head;

        ListNode result = head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode connectNode = head.next;

        while(odd != null && even != null){
            ListNode t = even.next;
            if(t == null)
                break;

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = connectNode;

        return result;
    }
}
