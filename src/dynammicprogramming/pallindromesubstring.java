package dynammicprogramming;

/**
 * Created by Prasannakshi on 11/9/2017.
 */
public class pallindromesubstring {
    public static String longestPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];
        String longest = null;
        int maxLen = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                    if(j-i+1>maxLen){
                        maxLen = j-i+1;
                        longest = s.substring(i, j+1);
                    }
                }
            }
        }
        return longest;
    }
    public static void main(String args[]){
        String result = longestPalindrome("dabcba");
    }
}
