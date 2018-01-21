package stringsnarrays;

/**
 * Created by Prasannakshi on 11/28/2017.
 */
public class detectcapital {
    public static boolean detectCapitalUse(String word) {
        int cnt = 0;
        for(char c: word.toCharArray()) if('Z' - c >= 0) cnt++;
        int temp = 'Z' - word.charAt(0);
        return ((cnt==0 || cnt==word.length()) || (cnt==1 && 'Z' - word.charAt(0)>=0));
    }
    public static void main(String args[]){
        boolean res = detectCapitalUse("FlaG");
    }
}
