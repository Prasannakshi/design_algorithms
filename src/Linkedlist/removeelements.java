package Linkedlist;

/**
 * Created by Prasannakshi on 11/10/2017.
 */
public class removeelements {
    public static void main(String args[]){
        ListNode input = new ListNode(3);
        input.next = new ListNode(1);
        input.next.next = new ListNode(5);
        input.next.next.next = new ListNode(6);
        input.next.next.next.next = new ListNode(8);
        input.next.next.next.next.next = new ListNode(9);
        int val = 6;
        ListNode output = removeval(input,val);
    }

    private static ListNode removeval(ListNode input, int val) {
        ListNode temp = new ListNode(0);
        temp.next = input;
        ListNode p = temp;
        while(p.next!=null){
            if(p.next.val == val){
                p.next = p.next.next;
            }
            else {
                p = p.next;
            }
        }

        return temp.next;
    }
}
