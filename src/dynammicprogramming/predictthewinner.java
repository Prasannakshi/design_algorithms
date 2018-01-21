package dynammicprogramming;

/**
 * Created by Prasannakshi on 11/8/2017.
 */
public class predictthewinner {
    public static boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) { dp[i][i] = nums[i]; }
        for (int len = 1; len < n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len;
                int a = nums[i] - dp[i + 1][j];
                int b = nums[j] - dp[i][j - 1];
                dp[i][j] = Math.max(a, b);
            }
        }
        return dp[0][n - 1] >= 0;
    }
    public static void main(String args[]){
        int[] inp = {2, 5, 20, 7};
        boolean res = PredictTheWinner(inp);
    }
}
