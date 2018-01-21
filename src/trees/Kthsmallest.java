package trees;

import java.util.Stack;

/**
 * Created by Prasannakshi on 8/27/2017.
 */
public class Kthsmallest {
    public static void main(String args[]){
        TreeNode input = new TreeNode(5);
        input.left = new TreeNode(2);
        input.right = new TreeNode(7);
        input.left.left = new TreeNode(1);
        input.left.right = new TreeNode(3);
        input.right.left = new TreeNode(6);
        input.right.right = new TreeNode(8);
        int result = smallest(input, 3);
    }

    private static int smallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode p = root;
        int result = 0;

        while(!stack.isEmpty() || p!=null){
            if(p!=null){
                stack.push(p);
                p = p.left;
            }else{
                TreeNode t = stack.pop();
                k--;
                if(k==0)
                    result = t.val;
                p = t.right;
            }
        }

        return result;
    }
}
