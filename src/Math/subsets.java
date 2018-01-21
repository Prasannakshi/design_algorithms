package Math;

import java.util.ArrayList;

/**
 * Created by Prasannakshi on 10/9/2017.
 */
public class subsets {
    static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    public static void main(String args[]){
        int[] input = {1,2,3};
        ArrayList<ArrayList<Integer>> answer = generatesubsets(input);
    }

    private static ArrayList<ArrayList<Integer>> generatesubsets(int[] input) {
        if(input == null){return null;}
        ArrayList<Integer> temp = new ArrayList<>();
        calculatesubset(input,temp,0);

        return result;
    }

    private static void calculatesubset(int[] input, ArrayList<Integer> temp, int n) {

        for(int i=n;i<input.length;i++){
            temp.add(input[i]);
            calculatesubset(input,temp,i+1);
            result.add(new ArrayList<Integer>(temp));
            temp.remove(temp.size() - 1);
        }
    }

}
