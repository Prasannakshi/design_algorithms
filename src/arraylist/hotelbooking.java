import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Prasannakshi on 3/20/2017.
 */
public class hotelbooking {

    public static void main(String args[]){
        ArrayList<Integer> arrival = new ArrayList<>(Arrays.asList( 11, 24, 36, 15, 16, 23, 20, 19));
        ArrayList<Integer> departure = new ArrayList<>(Arrays.asList( 14, 32, 67, 25, 21, 54, 61, 34));
        int roomcount = 4;
        System.out.print(bookpossible(arrival,departure,roomcount));
    }

    private static boolean bookpossible(ArrayList<Integer> arrival, ArrayList<Integer> departure, int roomcount) {
        Collections.sort(arrival);
        Collections.sort(departure);
        int ar=0, de=0, nos=0,satisfy=0;
        while(ar<arrival.size() && de<departure.size()){
            if(arrival.get(ar)<departure.get(de)){
                ar++;
                nos++;
                satisfy= Math.max(nos,satisfy);
            }else{
                de++;
                nos--;
            }
        }
         return (satisfy<=roomcount)?true:false;
    }
}
