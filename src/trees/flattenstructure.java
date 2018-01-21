package trees;

import java.util.LinkedList;

/**
 * Created by Prasannakshi on 10/2/2017.
 */
public class flattenstructure {
    public static void main(String args[]) {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(5);
        input.left.left = new TreeNode(3);
        input.left.right = new TreeNode(4);
        input.right.right = new TreeNode(6);
        TreeNode result = Flatten(input);
    }

    private static TreeNode Flatten(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
        TreeNode p = root;
        while(p!=null || !stack.isEmpty()) {
            if (p.right != null) {
                stack.push(p.right);
            }
            if(p.left!=null){
                p.right = p.left;
                p.left = null;
            }else if(!stack.isEmpty()){
                TreeNode temp = stack.pop();
                p.right=temp;
            }

            p = p.right;
        }
        return p;
    }
}
