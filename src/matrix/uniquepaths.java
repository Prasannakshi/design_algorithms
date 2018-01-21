package matrix;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/24/2017.
 */
public class uniquepaths {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1,2,3)));
        input.add(new ArrayList<>(Arrays.asList(4,5,6)));
        input.add(new ArrayList<>(Arrays.asList(7,8,9)));
        System.out.print(finduniquepaths(input));
    }

    private static int finduniquepaths(ArrayList<ArrayList<Integer>> input) {
        int m = input.size();
        int n = input.get(0).size();

        if(m==0 || n==0) return 0;
        if(m==1 || n==1) return 1;

        int[][] dp = new int[m][n];

        //left column
        for(int i=0; i<m; i++){
            dp[i][0] = 1;
        }

        //top row
        for(int j=0; j<n; j++){
            dp[0][j] = 1;
        }

        //fill up the dp table
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}
