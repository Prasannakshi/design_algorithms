package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/21/2017.
 */
public class nextpermutation {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(237, 542));
        findlexi(input);
    }

    private static void findlexi(ArrayList<Integer> input) {
        int n =input.size(),min=0,max=0;
        int compare = n-1;
        if(input.size()<2 || input==null){
            return;
        }
        for(int i=n-1;i>0;i--){
            if(input.get(i)>input.get(i-1)){
                min = i-1;
                break;
            }
        }

        for(int i=n-1;i>=0;i--){
            if(input.get(i)>input.get(min)) {
                max = i;
                break;
            }
        }
        int temp = input.get(min);
        input.set(min,input.get(max));
        input.set(max,temp);

        if(min==0 && max ==0 ){
            reverse(input,0,n-1);
        } else {
            reverse(input,min+1,n-1);
        }
    }

    private static void reverse(ArrayList input,int left, int right) {
        while(left<right) {
            int swap = (int) input.get(left);
            input.set(left, input.get(right));
            input.set(right, swap);
            left++;
            right--;
        }
    }
}
