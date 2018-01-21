package bfsdfsbbt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasannakshi on 12/18/2017.
 */
public class greycode {
    public static List<Integer> grayCode(int n) {
        List<Integer> rs=new ArrayList<Integer>();
        int len = 1<<n;

        for(int i=0;i< len;i++) {
            int right = i>>1;
            int j = i^i>>1;
            rs.add(j);
        }
        return rs;
    }
    public static void main(String args[]){
        List<Integer> result = grayCode(3);
    }
}
