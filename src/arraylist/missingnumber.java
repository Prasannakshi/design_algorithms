package arraylist;

/**
 * Created by Prasannakshi on 3/16/2017.
 */
public class missingnumber {
    public static void main(String args[]){
        int[] input = {0,1,3,4,5};
        System.out.print(findmiss(input));
    }

    private static int findmiss(int[] input) {
        int miss=0;
        for(int i=0; i<input.length; i++){
            miss ^= (i+1) ^input[i];
        }

        return miss;
    }
}
