package trees;

/**
 * Created by Prasannakshi on 10/4/2017.
 */
public class populatingnextrt {
    public static void main(String args[]){
        TreeLinkNode input = new TreeLinkNode(1);
        input.left = new TreeLinkNode(2);
        input.right = new TreeLinkNode(3);
        input.left.left = new TreeLinkNode(4);
        input.right.left = new TreeLinkNode(6);
        input.right.right = new TreeLinkNode(7);
        connect(input);
    }

    public static void connect(TreeLinkNode root) {
        if (root == null)
            return;
        TreeLinkNode dummy = new TreeLinkNode(0);
        dummy.next = root;
        while (dummy.next != null) {
            TreeLinkNode cur = dummy.next, pre = dummy;
            dummy.next = null;
            while (cur != null) {
                if (cur.left != null)
                    pre = pre.next = cur.left;
                if (cur.right != null)
                    pre = pre.next = cur.right;
                cur = cur.next;
            }
        }
    }

    private static class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }
}
