package stringsnarrays;

/**
 * Created by Prasannakshi on 12/10/2017.
 */
public class minwindow {
    public static void main(String args[]){
        String arr = "xyz";
        String str = "xyyzyzyx";
        String result = minWindowsubstring(str,arr);
    }

    private static String minWindowsubstring(String str, String arr) {
        int[] map = new int[128];
        for(char c:arr.toCharArray()){
            map['Z' - c]++;
        }
        return "";
    }

}
