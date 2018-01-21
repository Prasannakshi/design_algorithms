package trees;

/**
 * Created by Prasannakshi on 10/8/2017.
 */
public class counttreenodes {
    static int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }
    public static int countNodes(TreeNode root) {
        int h = height(root);
        int l = height(root.right);
        return h < 0 ? 0 :
                l == h-1 ? (1 << h) + countNodes(root.right)
                        : (1 << h-1) + countNodes(root.left);
    }
    public static void main(String args[]){
        TreeNode input = new TreeNode(5);
        input.left = new TreeNode(3);
        input.left.left = new TreeNode(1);
        input.left.right = new TreeNode(8);
        input.right = new TreeNode(7);
        input.right.left = new TreeNode(4);
//        input.right.right = new TreeNode(9);
        int result = countNodes(input);
    }
}
