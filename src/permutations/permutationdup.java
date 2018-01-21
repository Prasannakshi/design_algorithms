package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/22/2017.
 */
public class permutationdup {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,2));
        ArrayList<ArrayList<Integer>> output = findpermutdup(input);
    }

    private static ArrayList<ArrayList<Integer>> findpermutdup(ArrayList<Integer> input) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        permuteUnique(input, 0, result);
        return result;
    }

    private static void permuteUnique(ArrayList<Integer> input, int start, ArrayList<ArrayList<Integer>> result) {
        if (start >= input.size()) {
            result.add(input);
        }

        for (int j = start; j <= input.size()-1; j++) {
            if (containsDuplicate(input, start, j)) {
                swap(input, start, j);
                permuteUnique(input, start + 1, result);
                swap(input, start, j);
            }
        }
    }

    private static boolean containsDuplicate(ArrayList<Integer> input, int start, int end) {
        for (int i = start; i <= end-1; i++) {
            if (input.get(i) == input.get(end)) {
                return false;
            }
        }
        return true;
    }

    private static void swap(ArrayList<Integer> input, int i, int j) {
        int temp = input.get(i);
        input.set(i,input.get(j));
        input.set(j,temp);
    }
}
