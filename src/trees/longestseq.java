package trees;

import java.util.LinkedList;

/**
 * Created by Prasannakshi on 9/9/2017.
 */
public class longestseq {
    public static int longestConsecutive(TreeNode root) {
        if(root==null)
            return 0;

        LinkedList<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        LinkedList<Integer> sizeQueue = new LinkedList<Integer>();

        nodeQueue.offer(root);
        sizeQueue.offer(1);
        int max=1;

        while(!nodeQueue.isEmpty()){
            TreeNode head = nodeQueue.poll();
            int size = sizeQueue.poll();

            if(head.left!=null){
                int leftSize=size;
                if(head.val==head.left.val-1){
                    leftSize++;
                    max = Math.max(max, leftSize);
                }else{
                    leftSize=1;
                }

                nodeQueue.offer(head.left);
                sizeQueue.offer(leftSize);
            }

            if(head.right!=null){
                int rightSize=size;
                if(head.val==head.right.val-1){
                    rightSize++;
                    max = Math.max(max, rightSize);
                }else{
                    rightSize=1;
                }

                nodeQueue.offer(head.right);
                sizeQueue.offer(rightSize);
            }


        }

        return max;
    }
    public static void main(String args[]){
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(7);
        input.left.left = new TreeNode(3);
        input.left.left.right = new TreeNode(4);
        int length = longestConsecutive(input);
    }
}
