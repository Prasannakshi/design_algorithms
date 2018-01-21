package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Prasannakshi on 12/27/2017.
 */
public class houserobber {
    public static int rob(TreeNode root) {
        if(root==null){return 0;}
        int evensum=0, oddsum=0;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> level = new LinkedList<>();
        queue.add(root);
        level.add(0);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int l = level.poll();
                TreeNode temp = queue.poll();
                if(l%2==0){evensum+=temp.val;}
                else{oddsum+=temp.val;}

                if(temp.left!=null){
                    queue.add(temp.left);
                    level.add(l+1);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                    level.add(l+1);
                }

            }
        }
        return Math.max(evensum, oddsum);
    }
    public static void main(String args[]){
        TreeNode input = new TreeNode(3);
        input.left = new TreeNode(2);
        input.left.right = new TreeNode(3);
        input.right = new TreeNode(3);
        input.right.right = new TreeNode(1);
        int res = rob(input);
    }
}
