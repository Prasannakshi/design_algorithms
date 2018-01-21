package trees;

/**
 * Created by Prasannakshi on 8/4/2017.
 */
public class recoverBST {
    static TreeNode first;
    static TreeNode second;
    static TreeNode pre;

    public static void main(String args[]){
        TreeNode input = new TreeNode(5);
        input.left = new TreeNode(3);
        input.left.left = new TreeNode(1);
        input.left.right = new TreeNode(8);
        input.right = new TreeNode(7);
        input.right.left = new TreeNode(4);
//        input.right.right = new TreeNode(9);
        recoverTree(input);
    }

    public static void inorder(TreeNode root){
        if(root==null)
            return;

        inorder(root.left);

        if(pre==null){
            pre=root;
        }else{
            if(root.val<pre.val){
                if(first==null){
                    first=pre;
                }

                second=root;
            }
            pre=root;
        }

        inorder(root.right);
    }

    public static void recoverTree(TreeNode root) {
        if(root==null)
            return;
        inorder(root);
        if(second!=null && first !=null){
            int val = second.val;
            second.val = first.val;
            first.val = val;
        }
    }
}
