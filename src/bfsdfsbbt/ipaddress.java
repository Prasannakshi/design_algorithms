package bfsdfsbbt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasannakshi on 12/7/2017.
 */
public class ipaddress {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        dfs(s, 0, "", result, 0);
        return result;
    }
    private static void dfs(String input, int pos, String ans, List<String> result, int count){
        if(count>4) return;
        if(count==4 && pos==input.length()){result.add(ans);}
        for(int i=1;i<4;i++){
            if(pos+i>input.length()) break;
            String s1 = input.substring(pos,pos+i);
            if((s1.startsWith("0")&&s1.length()>1) || (i==3 && Integer.parseInt(s1)>=256)){
                continue;
            }
            dfs(input, pos+i, ans+s1+(count==3?"":"."), result, count+1);

        }
    }
    public static void main(String args[]){
        List<String> res = restoreIpAddresses("0000");
    }
}
