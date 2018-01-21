package trees;

/**
 * Created by Prasannakshi on 10/4/2017.
 */
public class BTmaxsum {
    static int maxValue;
    public static void main(String args[]){
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(5);
        input.left.left = new TreeNode(4);
        input.left.right = new TreeNode(6);
        int result = maxPathSum(input);
    }
    public static int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }

    private static int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val);
        return Math.max(left, right) + node.val;
    }

}
