package permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasannakshi on 3/28/2017.
 */
public class drawparenthesis {
    public static void main(String args[]){
        List<String> output = generateParenthesis(2);
        for(String i:output){
            System.out.print(i);
        }
    }

    private static List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        comboparenthesis(result, "", n, n);
        return result;
    }

    private static void comboparenthesis(ArrayList<String> result, String s, int left, int right) {
        if(left > right)
            return;

        if(left==0&&right==0){
            result.add(s);
            return;
        }

        if(left>0){
            comboparenthesis(result, s+"(", left-1, right);
        }

        if(right>0){
            comboparenthesis(result, s+")", left, right-1);
        }
    }


}
