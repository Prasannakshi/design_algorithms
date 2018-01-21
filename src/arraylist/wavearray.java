import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Prasannakshi on 3/20/2017.
 */
public class wavearray {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(11, 8, 7, 9, 2, 10, 2));
        ArrayList<Integer> output = formwave(input);
        for(Integer i:output){
            System.out.print(i);
        }
    }

    private static ArrayList<Integer> formwave(ArrayList<Integer> input) {
        Collections.sort(input);
        int n = input.size();
        if(n==1){
            return input;
        }
        for(int i=0;i<n-1;i=i+2){
            int temp = input.get(i+1);
            input.set(i+1,input.get(i));
            input.set(i,temp);
        }
        return input;
    }
}
