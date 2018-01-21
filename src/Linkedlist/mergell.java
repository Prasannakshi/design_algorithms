package Linkedlist;

/**
 * Created by Prasannakshi on 6/12/2017.
 */
public class mergell {
    public static void main(String args[]){
        ListNode first = new ListNode(2);
        first.next = new ListNode(4);
        first.next.next = new ListNode(3);
        ListNode second = new ListNode(5);
        second.next = new ListNode(6);
        second.next.next = new ListNode(8);
        ListNode answer = merge(first,second);
    }

    private static ListNode merge(ListNode first, ListNode second) {
        ListNode p1 = first;
        ListNode p2 = second;

        //merge two lists here
        while (p2 != null) {
            ListNode temp1 = p1.next;
            ListNode temp2 = p2.next;

            p1.next = p2;
            p2.next = temp1;

            p1 = temp1;
            p2 = temp2;
        }
        return first;
    }
}
