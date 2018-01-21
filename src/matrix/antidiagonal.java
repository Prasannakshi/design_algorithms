import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/19/2017.
 */
public class antidiagonal {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        input.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        input.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
        input.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
        input.add(new ArrayList<Integer>(Arrays.asList(10,11,12)));
        ArrayList<ArrayList<Integer>> output = computediagonal(input);
        for(ArrayList i: output){
            for(int j=0;j<i.size();j++){
                System.out.print(i.get(j));
                System.out.print(",");
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> computediagonal(ArrayList<ArrayList<Integer>> input) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int m = input.size(),n=input.get(0).size();
        for(int j=0;j<n;j++){
            ArrayList entry = new ArrayList();
            int i=0,s=j;
            while(s>=0) {
                entry.add(input.get(i++).get(s--));
            }
            result.add(entry);
        }

        for(int i=1;i<m;i++){
            ArrayList entry = new ArrayList();
            int j=n-1,t=i;
            while (t<m){
                entry.add(input.get(t++).get(j--));
            }
            result.add(entry);
        }


        return result;
    }
}
