package Linkedlist;

/**
 * Created by Prasannakshi on 6/23/2017.
 */
public class deletenode {
    public static void main(String args[]){
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);
        System.out.print(delete(input.next.next));
    }

    private static boolean delete(ListNode head) {
//        ListNode one = head.next;
//        head.val = one.val;
//        head.next = one.next;
        head = head.next;
        return true;
    }
}
