package Linkedlist;

import java.util.HashSet;

/**
 * Created by Prasannakshi on 6/23/2017.
 */
public class removedups2 {
    public static void main(String args[]){
        ListNode input = new ListNode(3);
        input.next = new ListNode(7);
        input.next.next = new ListNode(2);
        input.next.next.next = new ListNode(7);
        input.next.next.next.next = new ListNode(8);
        input.next.next.next.next.next= new ListNode(3);
        input.next.next.next.next.next.next= new ListNode(1);
        ListNode output = remove(input);

    }

    private static ListNode remove(ListNode n) {
        ListNode head = n;
        HashSet<Integer> set = new HashSet<>();
        ListNode previous = null;
        while (head!=null){
            if(set.contains(head.val)){
                previous.next = head.next;
            } else {
                set.add(head.val);
                previous = head;
            }
            head = head.next;
        }
        return n;


//        ListNode n = head;
//
//        while (n!=null){
//            int s = n.val;
//            ListNode m = new ListNode(0);
//            m.next = n.next;
//            while (m.next!=null){
//                if(s==m.next.val){
//                    m.next = m.next.next;
//                } else {
//                    m = m.next;
//                }
//            }
//            n = n.next;
//        }
//
//        return head;
    }
}
