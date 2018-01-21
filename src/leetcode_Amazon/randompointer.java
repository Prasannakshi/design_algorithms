package leetcode_Amazon;

/**
 * Created by Prasannakshi on 5/5/2017.
 */
public class randompointer {
    public static void main(String args[]){
        RandomListNode input = new RandomListNode(2);
        input.next = new RandomListNode(4);
        input.next.next = new RandomListNode(6);
        input.next.next.next = new RandomListNode(8);
        input.next.next.next.next = new RandomListNode(10);
        input.next.next.next.random = input.next;
        RandomListNode result = copyRandomList(input);
    }

    public static RandomListNode copyRandomList(RandomListNode head) {

        if (head == null)
            return null;

        RandomListNode p = head;

        // copy every node and insert to list
        while (p != null) {
            RandomListNode copy = new RandomListNode(p.label);
            copy.next = p.next;
            p.next = copy;
            p = copy.next;
        }

        // copy random pointer for each new node
        p = head;
        while (p != null) {
            if (p.random != null)
                p.next.random = p.random.next;
            p = p.next.next;
        }

        // break list to two
        p = head;
        RandomListNode newHead = head.next;
         while (p != null) {
            RandomListNode temp = p.next;
            p.next = temp.next;
            if (temp.next != null)
                temp.next = temp.next.next;
            p = p.next;
        }

        return newHead;
    }

    private static class RandomListNode {
        int label;
        RandomListNode next, random;
        RandomListNode(int x) { this.label = x; }
    }
}
