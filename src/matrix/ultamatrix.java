import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/21/2017.
 */
public class ultamatrix {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        input.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        input.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
        input.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
        findulta(input);
    }

    private static void findulta(ArrayList<ArrayList<Integer>> input) {
        int n = input.size();
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j <  Math.ceil(((double) n) / 2.); j++) {
                int temp = input.get(i).get(j);
                input.get(i).set(j,input.get(n-1-j).get(i));
                input.get(n-1-j).set(i,input.get(n-1-i).get(n-1-j));
                input.get(n-1-i).set(n-1-j,input.get(j).get(n-1-i));
                input.get(j).set(n-1-i,temp);
            }
        }
    }
}
