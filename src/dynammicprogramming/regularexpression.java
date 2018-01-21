package dynammicprogramming;

/**
 * Created by Prasannakshi on 11/15/2017.
 */
public class regularexpression {
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] result = new boolean[m+1][n+1];
        for(int i=1;i<=n;i++){
            if(p.charAt(i-1)=='*'){
                result[0][i] = result[0][i-2];
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(p.charAt(j-1)!='*' && (p.charAt(j-1)==s.charAt(i-1) || p.charAt(j-1)=='.')){
                    result[i][j] = result[i-1][j-1];
                } else if (p.charAt(j-1)=='*') {
                    result[i][j] = result[i][j-2];
                    if(p.charAt(j-2)==s.charAt(i-1) || p.charAt(j-2)=='.'){
                        result[i][j] |= result[i-1][j];
                    }
                }
            }
        }
        return result[m][n];
    }
    public static void main(String args[]){
        boolean result = isMatch("aa","aa");
        System.out.print(result);
    }
}
