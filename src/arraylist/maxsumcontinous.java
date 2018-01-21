import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasannakshi on 2/22/2017.
 */
public class maxsumcontinous {
    public static void main(String args[]){
        List<Integer> input = new ArrayList<>();
        input.add(-6);
        input.add(2);
        input.add(-4);
        input.add(1);
        input.add(3);
        input.add(-1);
        input.add(5);
        input.add(-1);
        System.out.print(maxSubArray(input));
    }
    public static int maxSubArray(final List<Integer> a) {
        int sum = Integer.MIN_VALUE;
        int last = 0;

        for (int num : a) {

            last += num;
            sum = Math.max(sum, last);
            if (last < 0)
                last = 0;
        }
        return sum;
//
//    List<Integer> result = new ArrayList<>();
//        result.add(a.get(0));
//        Integer max = 0;
//        for (int i = 1; i < a.size(); i++) {
//            result.add(Math.max(result.get(i - 1)+a.get(i),a.get(i)));
//                max = Collections.max(result);
//        }
//        return max;
    }
}
//
