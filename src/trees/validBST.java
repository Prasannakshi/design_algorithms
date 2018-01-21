package trees;

/**
 * Created by Prasannakshi on 10/2/2017.
 */
public class validBST {
    public static void main(String args[]) {
        TreeNode input = new TreeNode(5);
        input.left =new TreeNode(3);
        input.right =new TreeNode(6);
        input.left.left =new TreeNode(1);
        input.left.left.right =new TreeNode(2);
        Boolean result = isValidBST(input, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    private static boolean isValidBST(TreeNode p, double min, double max) {
        if(p==null)
            return true;
        if(p.val <= min || p.val >= max)
            return false;
        return isValidBST(p.left, min, p.val) && isValidBST(p.right, p.val, max);
    }
}
