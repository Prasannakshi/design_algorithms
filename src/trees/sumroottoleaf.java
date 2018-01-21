package trees;

/**
 * Created by Prasannakshi on 10/9/2017.
 */
public class sumroottoleaf {
    public static void main(String args[]){
        TreeNode input = new TreeNode(5);
        input.left = new TreeNode(3);
        input.left.left = new TreeNode(7);
        input.left.right = new TreeNode(1);
        input.right = new TreeNode(2);
        input.right.left = new TreeNode(6);
        input.right.right = new TreeNode(4);
        int result = sumNumbers(input);
    }
    public static int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;

        return dfs(root, 0, 0);
    }

    public static int dfs(TreeNode node, int num, int sum){
        if(node == null) return sum;

        num = num*10 + node.val;

        // leaf
        if(node.left == null && node.right == null) {
            sum += num;
            return sum;
        }

        // left subtree + right subtree
        sum = dfs(node.left, num, sum) + dfs(node.right, num, sum);
        return sum;
    }
}
