package stringsnarrays;

/**
 * Created by Prasannakshi on 11/30/2017.
 */
public class longprefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            int temp = strs[i].indexOf(pre);
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
    public static void main(String args[]){
        String[] input = {"test","test","tesas","teach"};
        String res = longestCommonPrefix(input);
    }
}
