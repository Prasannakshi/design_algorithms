package leetcode_Amazon;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Prasannakshi on 5/7/2017.
 */
public class deserialize {
    private static final String spliter = ",";
    private static final String NN = "#";

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x ){
            val = x;
        }
    }
    public static void main(String args[]){
        String input = "1,2,3,#,#,4,5";
        TreeNode result = dodeserialize(input);
    }

    public static TreeNode dodeserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(nodes);
    }

    private static TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals(NN)) return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }
}
