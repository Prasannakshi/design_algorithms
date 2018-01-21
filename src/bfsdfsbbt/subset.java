package bfsdfsbbt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Prasannakshi on 12/19/2017.
 */
public class subset {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res, answer ,nums, 0);
        return res;
    }
    private static void backtrack(List<List<Integer>> result, List<Integer> answer, int[] input, int start){
        result.add(new ArrayList<>(answer));
        for (int i=start;i<input.length;i++){
            if(i>0 && input[i]==input[i-1]) continue;
            answer.add(input[i]);
            backtrack(result,answer, input, i+1);
            answer.remove(answer.size()-1);
        }
    }
    public static void main(String args[]){
        int[] nums = {1,2,2};
        List<List<Integer>> res = subsetsWithDup(nums);
    }
}
