package Linkedlist;

/**
 * Created by Prasannakshi on 6/11/2017.
 */
public class add2numsll {
    public static void main(String args[]){
        ListNode one = new ListNode(2);
        one.next = new ListNode(4);
        one.next.next = new ListNode(3);
        ListNode two = new ListNode(5);
        two.next = new ListNode(6);
        two.next.next = new ListNode(6);
        ListNode result = Addtwo(one,two);
        System.out.print(result);
    }

    // trying with recursion
    private static ListNode Addtwo(ListNode one, ListNode two) {
        ListNode result = new ListNode(0);
        recursiveaddtwo(one,two,result,0);
        return result.next;
//        ListNode value1 = one;
//        ListNode value2 = two;
//        ListNode result = null,output = null;
//        int sum = 0;
//        while(value1!=null || value2!=null){
//            if(value1!=null){
//                sum += value1.val;
//                value1 = value1.next;
//            }
//            if(value2!=null){
//                sum += value2.val;
//                value2 = value2.next;
//            }
//
//            if(result == null){
//                result = new ListNode(sum%10);
//                output = result;
//            }else {
//                output.next = new ListNode(sum%10);
//                output = output.next;
//            }
//            sum /= 10;
//        }
//        if(sum==1)
//            output.next=new ListNode(1);
//        return result;
    }

    private static void recursiveaddtwo(ListNode one, ListNode two, ListNode temp, int carry) {
        if(carry==1){temp.next = new ListNode(1);}
        if(one==null&&two==null){return;}
        int sum = one.val + two.val + carry;
        temp.next = new ListNode(sum%10);
        recursiveaddtwo(one.next,two.next,temp.next,sum/10);
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
