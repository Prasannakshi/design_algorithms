import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.IndexOutOfBoundsException.*;

/**
 * Created by Prasannakshi on 11/13/2016.
 */
public class coinselection {
    public static void main(String[] args) {
        int[] coins = {1, 6, 10, 19};
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the value of the coin");
        String getinput = SC.next();
        int value = Integer.valueOf(getinput);
        System.out.print("Array M: "+martiancoin(coins,value));

    }

    private static ArrayList<Integer> martiancoin(int[] coins,int value) {
        ArrayList<Integer> result = new ArrayList<>();
        if(value == 0){
            result.add(0);
        }
        else{
            result.add(0,0);
            for(int i=1;i<=value;i++){
                ArrayList<Integer> min = new ArrayList<>();
                for(int j=0;j<=coins.length-1;j++){
                    try{
                    min.add(result.get(i-coins[j]));
                    }catch (IndexOutOfBoundsException el) {
                        min.add(100000);
                    }
                }
                result.add(i,(getminval(min)+1));
            }
        }
        return result;
    }

    private static Integer getmaxval(ArrayList<Integer> array) {
        int nextval = array.get(0);
        for(int i=0;i<=array.size()-1;i++){
            if(array.get(i)>nextval){
                nextval = array.get(i);
            }
        }
        return nextval;
    }

    private static Integer getminval(ArrayList<Integer> array) {
        int nextval = array.get(0);
        for(int i=0;i<=array.size()-1;i++){
            if(array.get(i)<nextval){
                nextval = array.get(i);
            }
        }
        return nextval;

    }
}
