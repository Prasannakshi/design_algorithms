import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 2/28/2017.
 */
public class setZeros {
    public static void setZeroes(ArrayList<ArrayList<Integer>> matrix) {
        boolean firstRowZero = false;
        boolean firstColumnZero = false;

        //set first row and column zero or not
        for(int i=0; i<matrix.size(); i++) {
            if(matrix.get(i).get(0)==0){
                firstColumnZero = true;
                break;
            }
        }

        for(int i=0; i<matrix.get(0).size(); i++){
            if(matrix.get(0).get(i) == 0){
                firstRowZero = true;
                break;
            }
        }

        //mark zeros on first row and column
        for(int i=1; i<matrix.size(); i++){
            for(int j=1; j<matrix.get(i).size(); j++){
                if(matrix.get(i).get(j) == 0){
                    matrix.get(i).set(0,0);
                    matrix.get(0).set(j,0);
                }
            }
        }
        //use mark to set elements
        for(int i=1; i<matrix.size(); i++) {
            for (int j = 1; j < matrix.get(0).size(); j++) {
                if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
            //set first column and row
        if (firstColumnZero) {
            for (int m = 0; m < matrix.size(); m++) {
                matrix.get(m).set(0, 0);
            }
        }

        if (firstRowZero) {
            for (int n = 0; n < matrix.get(0).size(); n++)
                matrix.get(0).set(n, 0);
        }
    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        input.add(new ArrayList<Integer>(Arrays.asList(1,0,1)));
        input.add(new ArrayList<Integer>(Arrays.asList(1,1,0)));
        input.add(new ArrayList<Integer>(Arrays.asList(1,1,1)));
        setZeroes(input);
        for(int i=0;i<input.size();i++){
            System.out.print(input.get(i));
        }
    }
}
