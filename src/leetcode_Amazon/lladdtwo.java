package leetcode_Amazon;

/**
 * Created by Prasannakshi on 5/5/2017.
 */
public class lladdtwo {
    public static void main(String args[]){
        ListNode one = new ListNode(2);
        one.next = new ListNode(4);
        one.next.next = new ListNode(3);
        ListNode two = new ListNode(5);
        two.next = new ListNode(6);
        two.next.next = new ListNode(6);
        ListNode result = Addtwo(one,two);
    }

    private static ListNode Addtwo(ListNode one, ListNode two) {
        ListNode value1 = one;
        ListNode value2 = two;
        ListNode result = null,output = null;
        int sum = 0;
        while(value1!=null){
            sum = value1.val+value2.val+(sum/10);
            if(result == null){
                result = new ListNode(sum%10);
                output = result;
            }else {
                output.next = new ListNode(sum%10);
                output = output.next;
            }
            value1 = value1.next;
            value2 = value2.next;
        }
        return result;
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
