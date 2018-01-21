package bfsdfsbbt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasannakshi on 12/7/2017.
 */
public class combination {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> answer = new ArrayList<Integer>();
        dfs(candidates, result, answer, 0, target);
        return result;
    }
    private static void dfs(int[] input, List<List<Integer>> result, List<Integer> answer, int sum, int target){
        if(sum>target){
            return;
        }
        else if(sum==target){
            result.add(new ArrayList<Integer>(answer));
        }
        else{
            for(int i=0;i<input.length;i++){
                answer.add(input[i]);
                dfs(input, result, answer, sum+input[i], target);
                answer.remove(answer.size()-1);
            }
        }
    }
    public static void main(String args[]){
        int[] input = {2,3,6,7};
        List<List<Integer>> result = combinationSum(input,7);
    }
}
