package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Prasannakshi on 3/16/2017.
 */
public class duplicatenum {
    public static void main(String args[]){
        List<Integer> input = new ArrayList<>(Arrays.asList(7,2,8,5,1,3,4,6,2,9));
        System.out.print(finddup(input));
    }

    private static int finddup(List input) {
//        int slow = 0;
//        int fast = 0;
//
//        do{
//            slow = (int) input.get(slow);
//            fast = (int) input.get((int)input.get(fast));
//        } while(slow != fast);
//
//        int find = 0;
//
//        while(find != slow){
//            slow = (int)input.get(slow);
//            find = (int)input.get(find);
//        }
//        return find;
        int l=1,r=input.size()-1;
        while(l<r){
            int m=(l+r)/2;
            int c=0;

            for(int i=0;i<input.size();i++){
                if((int)input.get(i)<=m){
                    c++;
                }
            }
            //if c < m,
            if(c>m){
                r=m;
            }else{
                l=m+1;
            }
        }
        return r;
    }
}

