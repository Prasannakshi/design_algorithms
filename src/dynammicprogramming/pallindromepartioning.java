package dynammicprogramming;

/**
 * Created by Prasannakshi on 11/10/2017.
 */
public class pallindromepartioning {
    public static int palindromePartitioning(String s) {
        int n = s.length();
        if(s.length()==0)return 0;
        int[] res = new int[n+1];
        for(int i=0;i<s.length();i++) res[i]=Integer.MAX_VALUE;
        res[n] = -1;
        for(int i=n-1; i>=0;i--){
            for(int a=i,b=i; a>=0 && b<n && s.charAt(a)==s.charAt(b);a--,b++){res[a]=Math.min(res[a],1+res[b+1]);}
            for(int a=i,b=i+1; a>=0 && b<n && s.charAt(a)==s.charAt(b);a--,b++){res[a]=Math.min(res[a],1+res[b+1]);}
        }
        return res[0];
    }
    public static void main(String args[]){
        String input = "efe";
        int result = palindromePartitioning(input);
    }
}
