import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Prasannakshi on 3/21/2017.
 */
public class maxgap {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 10, 5));
        System.out.print(findmaxgap(input));
    }

    private static int findmaxgap(ArrayList<Integer> input) {
        int result = -1;
        if(input == null || input.size() < 2){
            return 0;
        }

        Collections.sort(input);

        for(int i=input.size()-1;i>0;i--){
            int max = input.get(i)-input.get(i-1);
            if(result<max){
                result=max;
            }
        }
        return result;
    }
}
