package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasannakshi on 10/8/2017.
 */
public class uniqueBST {
    public static void main(String args[]){
        List<TreeNode> result = numTrees(3);
    }
    public static List<TreeNode> numTrees(int n) {
        if(n==0){
            return new ArrayList<TreeNode>();
        }

        return helper(1, n);
    }
    public static List<TreeNode> helper(int m, int n){
        List<TreeNode> result = new ArrayList<TreeNode>();
        if(m>n){
            result.add(null);
            return result;
        }

        for(int i=m; i<=n; i++){
            List<TreeNode> ls = helper(m, i-1);
            List<TreeNode> rs = helper(i+1, n);
            for(TreeNode l: ls){
                for(TreeNode r: rs){
                    TreeNode curr = new TreeNode(i);
                    curr.left=l;
                    curr.right=r;
                    result.add(curr);
                }
            }
        }

        return result;
    }
}
