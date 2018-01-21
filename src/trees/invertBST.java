package trees;

import java.util.LinkedList;

/**
 * Created by Prasannakshi on 8/27/2017.
 */
public class invertBST {
    public static void main(String args[]){
        TreeNode input = new TreeNode(5);
        input.left = new TreeNode(2);
        input.right = new TreeNode(7);
        input.left.left = new TreeNode(1);
        input.left.right = new TreeNode(3);
        input.right.left = new TreeNode(6);
        input.right.right = new TreeNode(8);
        TreeNode result = invert(input);
    }

    private static TreeNode invert(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        if(root!=null){
            queue.add(root);
        }

        while(!queue.isEmpty()){
            TreeNode p = queue.poll();

            if(p.right!=null)
                queue.add(p.right);
            if(p.left!=null)
                queue.add(p.left);

            TreeNode temp = p.left;
            p.left = p.right;
            p.right = temp;
        }

        return root;
    }
}
