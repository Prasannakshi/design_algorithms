package matrix;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/23/2017.
 */
public class minimumpath {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1,1,3)));
        input.add(new ArrayList<>(Arrays.asList(4,1,6)));
        input.add(new ArrayList<>(Arrays.asList(7,1,9)));
        System.out.print(findminpath(input));
    }

    private static int findminpath(ArrayList<ArrayList<Integer>> input) {
        return dfs(0,0,input);
//        if(input == null || input.size()==0) {
//            return 0;
//        }
//        int m = input.size();
//        int n = input.get(0).size();
//
//        int[][] dp = new int[m][n];
//        dp[0][0] = input.get(0).get(0);
//
//        // initialize top row
//        for(int i=1; i<n; i++){
//            dp[0][i] = dp[0][i-1] + input.get(0).get(i);
//        }
//
//        // initialize left column
//        for(int j=1; j<m; j++){
//            dp[j][0] = dp[j-1][0] + input.get(j).get(0);
//        }
//
//        // fill up the dp table
//        for(int i=1; i<m; i++){
//            for(int j=1; j<n; j++){
//                if(dp[i-1][j] > dp[i][j-1]){
//                    dp[i][j] = dp[i][j-1] + input.get(i).get(j);
//                }else{
//                    dp[i][j] = dp[i-1][j] + input.get(i).get(j);
//                }
//            }
//        }
//
//        return dp[m-1][n-1];
    }

    private static int dfs(int i, int j, ArrayList<ArrayList<Integer>> input) {
        if (i == input.size() - 1 && j == input.get(0).size() - 1) {
            return input.get(i).get(j);
        }

        if (i < input.size() - 1 && j < input.get(0).size() - 1) {

            int r1 = input.get(i).get(j) + dfs(i+1,j,input);
            int r2 = input.get(i).get(j) + dfs(i,j+1,input);
            return Math.min(r1, r2);
        }

        if (i < input.size() - 1) {
            return input.get(i).get(j) + dfs(i + 1, j, input);
        }

        if (j < input.get(0).size() - 1) {
            return input.get(i).get(j) + dfs(i, j + 1, input);
        }
        return 0;
    }
}
