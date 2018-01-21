package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasannakshi on 3/19/2017.
 */
public class pascals {
    public static void main(String args[]){
        int input = 4;
//        ArrayList<ArrayList<Integer>> output = createpascals(input);
//        for(ArrayList i: output){
//            for(int j=0;j<i.size();j++){
//                System.out.print(i.get(j));
//                System.out.print(",");
//            }
//        }

        List<Integer> output = getRow(input);
        for(Integer i:output){
            System.out.print(i);
            System.out.print(",");
        }

    }

    private static ArrayList<Integer> returnpascals(int input) {

        ArrayList<Integer> result = new ArrayList<>();

        result.add(1);
        for (int i = 1; i <= input; i++) {
            for (int j = result.size() - 2; j >= 0; j--) {
                result.set(j + 1, result.get(j) + result.get(j + 1));
            }
            result.add(1);
        }
        return result;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if (rowIndex < 0)
            return list;

        for (int i = 0; i < rowIndex + 1; i++) {
            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }

    private static ArrayList<ArrayList<Integer>> createpascals(int input) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if (input <= 0){
            return result;
        }

        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(1);
        result.add(first);

        for (int i = 2; i <= input; i++) {
            ArrayList<Integer> rotate = new ArrayList<Integer>();

            rotate.add(1);
            for (int j = 0; j < first.size() - 1; j++) {
                rotate.add(first.get(j) + first.get(j + 1));
            }
            rotate.add(1);//last

            result.add(rotate);
            first = rotate;
        }

        return result;

    }
}
