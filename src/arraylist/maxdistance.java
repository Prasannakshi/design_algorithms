import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/20/2017.
 */
public class maxdistance {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
        System.out.print(findmaxdist(input));
    }

    private static int findmaxdist(ArrayList<Integer> input) {
        int result=-1,max=0;
        int l=0,r=input.size()-1;
        while(r >= l){
            if(input.get(r)>=input.get(l)){
                max = r-l;
            }
            if(r==l){
                l++;
                r=input.size()-1;
            }
            if(result < max){
                result = max;
            }
            r--;
        }
        return result;
    }
}
