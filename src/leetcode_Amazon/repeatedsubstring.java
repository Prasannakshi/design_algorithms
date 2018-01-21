package leetcode_Amazon;

/**
 * Created by Prasannakshi on 5/5/2017.
 */
public class repeatedsubstring {
    public static void main(String args[]){
        String input = "abcabca";
        System.out.print(isrepeated(input));
    }

    private static boolean isrepeated(String str) {
        int l = str.length();
        for(int i=l/2;i>=1;i--) {
            if(l%i==0) {
                int m = l/i;
                String subS = str.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<m;j++) {
                    sb.append(subS);
                }
                if(sb.toString().equals(str)) return true;
            }
        }
        return false;
    }
}
