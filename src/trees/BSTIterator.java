package trees;

import java.util.Stack;

/**
 * Created by Prasannakshi on 10/4/2017.
 */
public class BSTIterator {
    Stack<TreeNode> stack;

    public static void main(String args[]){
        TreeNode input = new TreeNode(8);
        input.left = new TreeNode(3);
        input.right = new TreeNode(9);
        input.left.left = new TreeNode(1);
        input.left.left.right = new TreeNode(2);
        BSTIterator test = new BSTIterator(input);
        System.out.print(test.next());
        System.out.print(test.next());
    }
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode node = stack.pop();
        int result = node.val;
        if (node.right != null) {
            node = node.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        return result;
    }
}
