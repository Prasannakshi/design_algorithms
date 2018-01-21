package Linkedlist;

/**
 * Created by Prasannakshi on 6/18/2017.
 */
public class intersectionll {
    public static void main(String args[]){
        ListNode input1 = new ListNode(1);
        input1.next = new ListNode(2);

        ListNode input2 = new ListNode(1);
        input2.next = new ListNode(2);
        input2.next.next = new ListNode(6);

        ListNode intersection = new ListNode(3);
        intersection.next = new ListNode(4);
        intersection.next.next = new ListNode(5);

        input1.next.next = intersection;
        input2.next.next.next = intersection;
        ListNode resultnode = findintersection(input1,input2);
    }

    private static ListNode findintersection(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }
//    int lenA = length(headA), lenB = length(headB);
//    // move headA and headB to the same start point
//    while (lenA > lenB) {
//        headA = headA.next;
//        lenA--;
//    }
//    while (lenA < lenB) {
//        headB = headB.next;
//        lenB--;
//    }
//    // find the intersection until end
//    while (headA != headB) {
//        headA = headA.next;
//        headB = headB.next;
//    }
//    return headA

    private static int length(ListNode node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }
}
