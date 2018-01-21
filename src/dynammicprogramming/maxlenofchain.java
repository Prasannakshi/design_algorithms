package dynammicprogramming;

import java.util.Arrays;

/**
 * Created by Prasannakshi on 11/6/2017.
 */
public class maxlenofchain {
    public static int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0) return 0;
        Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], pairs[i][0] > pairs[j][1]? dp[j] + 1 : dp[j]);
            }
        }
        return dp[pairs.length - 1];
    }
    public static void main(String args[]){
        int[][] input = {{1,2},{2,3},{12,15},{5,7}};
        int result = findLongestChain(input);
    }
}
