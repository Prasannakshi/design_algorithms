import java.util.ArrayList;

/**
 * Created by Prasannakshi on 2/22/2017.
 */
public class infinitegrid {

    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(3);
        a.add(7);
        a.add(0);
        b.add(5);
        b.add(2);
        b.add(8);
        System.out.print(coverPoints(a,b));
    }
    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int output=0;
        for(int i=0;i<X.size()-1;i++){
            int j = i+1;
            int x = Math.abs(X.get(i)-X.get(j));
            int y = Math.abs(Y.get(i)-Y.get(j));
            if (x> y){
                output += x;
            } else {
                output += y;
            }
        }
        return output;
    }
}
