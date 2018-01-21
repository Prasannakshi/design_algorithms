package trees;

/**
 * Created by Prasannakshi on 10/4/2017.
 */
public class lowestcommon {
    public static void main(String args[]){
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(3);
        input.right.left = new TreeNode(6);
        input.right.right = new TreeNode(7);
        input.left.left = new TreeNode(4);
        input.left.right = new TreeNode(5);
        input.left.left.left = new TreeNode(8);
        input.left.left.right = new TreeNode(9);
        input.left.right.left = new TreeNode(10);
        input.left.right.right = new TreeNode(11);
        TreeNode result = lowestCommonAncestor(input,input.left.left.right,input.left.right.left);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p,TreeNode q) {
        if(root==null)
            return null;

        if(root==p || root==q)
            return root;

        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);

        if(l!=null&&r!=null){
            return root;
        }else if(l==null&&r==null){
            return null;
        }else{
            return l==null?r:l;
        }
    }
}
