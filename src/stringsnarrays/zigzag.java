package stringsnarrays;

/**
 * Created by Prasannakshi on 12/12/2017.
 */
public class zigzag {
    public static String convert(String s, int numRows) {
        boolean[] used = new boolean[s.length()];
        String result = "";
        for(int i=0;i<s.length();i++){
            int j =i;
            while(j<s.length()&&!used[j]){
                used[j]=true;
                result=result+s.charAt(j);
                j=j+(numRows+1);
            }
        }
        return result;
    }
    public static void main(String args[]){
        String result = convert("PAYPALISHIRING",3);
    }
}
