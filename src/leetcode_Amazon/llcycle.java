package leetcode_Amazon;

/**
 * Created by Prasannakshi on 5/5/2017.
 */
public class llcycle {
    public static void main(String args[]){
        ListNode input = new ListNode(3);
        input.next = new ListNode(1);
        input.next.next = new ListNode(5);
        input.next.next.next = new ListNode(6);
        input.next.next.next.next = new ListNode(8);
        input.next.next.next.next.next = new ListNode(9);
        input.next.next.next.next.next.next = input.next.next;
        System.out.print(hasCycle(input));
    }

    private static boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) break;
        }
        walker = head;
        while( walker != runner) {
            walker = walker.next;
            runner = runner.next;
        }

        return false;
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
}
