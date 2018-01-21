package Linkedlist;

/**
 * Created by Prasannakshi on 6/15/2017.
 */
public class removerepeats {
    public static void main(String args[]){
        ListNode input = new ListNode(1);
        input.next = new ListNode(1);
        input.next.next = new ListNode(1);
        input.next.next.next = new ListNode(2);
        input.next.next.next.next = new ListNode(2);
        ListNode output = remrepeats(input);
    }

    private static ListNode remrepeats(ListNode head) {
        ListNode t = new ListNode(0);
        t.next = head;

        ListNode p = t;
//        ListNode ans = head;
//        while(p != null && p.next !=null){
//            if (p.val == p.next.val){
//                int dup = p.val;
//                while(p !=null&&p.val==dup){
//                    p = p.next;
//                }
//            } else{
//                p= p.next;
//            }
//        }
        while(p.next!=null&&p.next.next!=null){
            if(p.next.val == p.next.next.val){
                int dup = p.next.val;
                while(p.next!=null&&p.next.val==dup){
                    p.next = p.next.next;
                }
            }else{
                p=p.next;
            }

        }

        return t.next;
    }
}
