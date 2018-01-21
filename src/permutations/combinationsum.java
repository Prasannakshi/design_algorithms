package permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Prasannakshi on 3/29/2017.
 */
public class combinationsum {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,7));
        int target = 7;
        ArrayList<ArrayList<Integer>> output = findsumlist(input,7);
        for(ArrayList<Integer> i:output){
            for(Integer j:i){
                System.out.print(j+",");
            }
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> findsumlist(ArrayList<Integer> input,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if(input == null || input.size() == 0)
            return result;
        ArrayList<Integer> current = new ArrayList<Integer>();
        Collections.sort(input);

        findlist(input, target, 0, current, result);
        return result;
    }

    private static void findlist(ArrayList<Integer> candidates, int target, int j, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result) {
        if(target == 0){
            ArrayList<Integer> temp = new ArrayList<Integer>(curr);
            result.add(temp);
            return;
        }

//        int prev = -1;
        for(int i=j; i<candidates.size(); i++){
//            if(prev!=candidates.get(i)) {
                if (target < candidates.get(i))
                    return;

                curr.add(candidates.get(i));
                findlist(candidates, target - candidates.get(i), i+1, curr, result);
                curr.remove(curr.size() - 1);
//                prev = candidates.get(i);
//            }
        }
    }
}

//when used once in combination