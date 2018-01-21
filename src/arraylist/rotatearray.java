package arraylist;

import java.util.ArrayList;

/**
 * Created by Prasannakshi on 2/28/2017.
 */
public class rotatearray {

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            ret.add(A.get((i + B)%A.size()));
        }
        return ret;
    }
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        ArrayList<Integer> output = rotateArray(input,2);
    }
}
