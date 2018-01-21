import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/18/2017.
 */
public class maxnonneg {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(756898537, -1973594324, -2038664370, -184803526, 1424268980));
        ArrayList output = findmaxnon(input);
        for(Object i:output){
            System.out.print(i);
        }
    }

    private static ArrayList<Integer> findmaxnon(ArrayList<Integer> input) {
        ArrayList<Integer> view = new ArrayList();
        ArrayList<Integer> result = new ArrayList();
        long sum=0,compare=0;
        for(Integer i:input){
            if(i>=0){
                view.add(i);
                compare += (i);
            } else {
                compare = 0;
                view = new ArrayList<Integer>();
            }
            if((sum < compare) || ((sum == compare) && (view.size() > result.size()))){
                sum = compare;
                result = view;
            }
        }
        return result;
    }
}
