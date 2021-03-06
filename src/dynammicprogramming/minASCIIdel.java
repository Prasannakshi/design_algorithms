package dynammicprogramming;

/**
 * Created by Prasannakshi on 10/29/2017.
 */
public class minASCIIdel {
    public static void main(String args[]){
        int result = minimumDeleteSum("sea","eat");
    }
    public static int minimumDeleteSum(String s1, String s2) {
        int[][] count = new int[s1.length() + 1][s2.length() + 1];
        for(int i = 1; i < count.length; i++){
            count[i][0] = count[i-1][0] + s1.charAt(i-1);
        }
        for(int i = 1; i < count[0].length; i++){
            count[0][i] = count[0][i-1] + s2.charAt(i-1);
        }
        for(int i = 1; i < count.length; i++){
            for(int j = 1; j < count[0].length; j++){
                int cost = (s1.charAt(i-1) == s2.charAt(j-1))? 0 : s1.charAt(i-1) + s2.charAt(j-1);
                count[i][j] = Math.min(count[i-1][j] + s1.charAt(i-1), count[i][j-1] + s2.charAt(j-1));
                count[i][j] = Math.min(count[i][j], count[i-1][j-1] + cost);
            }
        }
        return count[s1.length()][s2.length()];
    }
}
