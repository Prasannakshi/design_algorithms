package leetcode_Amazon;

/**
 * Created by Prasannakshi on 5/5/2017.
 */
public class llpalindrome {
    static ListNode left;

    public static void main(String args[]){
        ListNode input = new ListNode('l');
        input.next = new ListNode('e');
        input.next.next = new ListNode('v');
        input.next.next.next = new ListNode('e');
        input.next.next.next.next = new ListNode('e');
        System.out.print(ispalindrome(input));
    }

    private static boolean ispalindrome(ListNode head) {
        if(head == null || head.next==null)
            return true;
        //find list center
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHead = slow.next;
        slow.next = null;

        //reverse second part of the list
        ListNode p1 = secondHead;
        ListNode p2 = p1.next;

        while(p1!=null && p2!=null){
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }

        secondHead.next = null;

        //compare two sublists now
        ListNode p = (p2==null?p1:p2);
        ListNode q = head;
        while(p!=null){
            if(p.val != q.val)
                return false;

            p = p.next;
            q = q.next;

        }
        return true;
    }

    public static boolean isPalindrome(ListNode head) {
        left = head;

        boolean result = helper(head);
        return result;
    }

    public static boolean helper(ListNode right){

        //stop recursion
        if (right == null)
            return true;

        //if sub-list is not palindrome,  return false
        boolean x = helper(right.next);
        if (!x)
            return false;

        //current left and right
        boolean y = (left.val == right.val);

        //move left to next
        left = left.next;

        return y;
    }


    static class ListNode{
        char val;
        ListNode next;
        ListNode(char x){
            val = x;
            next = null;
        }
    }
}
