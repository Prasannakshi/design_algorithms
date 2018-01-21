package permutations;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/29/2017.
 */
public class dpcombosum {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,7));
        int target = 7;
        System.out.print(dpsum(input,target));

    }

    private static int dpsum(ArrayList<Integer> input, int target) {
        if(input==null || input.size()==0)
            return 0;

        int[] dp = new int[target+1];

        dp[0]=1;

        for(int i=0; i<=target; i++){
            for(int num: input){
                if(i+num<=target){
                    dp[i+num]+=dp[i];
                }
            }
        }
        return dp[target];
    }
}
