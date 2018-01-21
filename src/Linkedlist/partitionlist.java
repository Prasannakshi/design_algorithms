package Linkedlist;

/**
 * Created by Prasannakshi on 6/15/2017.
 */
public class partitionlist {
    public static void main(String args[]){
        ListNode input = new ListNode(1);
        input.next = new ListNode(4);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(2);
        input.next.next.next.next = new ListNode(5);
        input.next.next.next.next.next = new ListNode(2);
        ListNode output = partition(input,3);
    }

    private static ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);  //dummy heads of the 1st and 2nd queues
        ListNode curr1 = dummy1, curr2 = dummy2;      //current tails of the two queues;
        while (head!=null){
            if (head.val<x) {
                curr1.next = head;
                curr1 = head;
            }else {
                curr2.next = head;
                curr2 = head;
            }
            head = head.next;
        }
        curr2.next = null;          //important! avoid cycle in linked list. otherwise u will get TLE.
        curr1.next = dummy2.next;
        return dummy1.next;
    }
}
