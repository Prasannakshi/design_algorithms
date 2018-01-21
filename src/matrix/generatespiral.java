import java.util.ArrayList;

/**
 * Created by Prasannakshi on 3/19/2017.
 */
public class generatespiral {
    public static void main(String args[]){
        int input = 4;
        ArrayList<ArrayList<Integer>> output = createspiral(input);
        for(ArrayList i: output){
            for(int j=0;j<i.size();j++){
                System.out.print(i.get(j));
                System.out.print(",");
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> createspiral(int input) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int x=0,y=0,level=0;
        int num = input*input;

        for(int i=0;i<input;i++){
            ArrayList<Integer> create = new ArrayList<Integer>();
            for(int j=0;j<input;j++){
                create.add(0);
            }
            result.add(create);
        }

        for(int i=1;i<num+1;) {

            while (y + level < input) {
                result.get(x).set(y++,i++);
            }
            y--;
            x++;

            while (x + level < input) {
                result.get(x++).set(y,i++);
            }
            x--;
            y--;

            while (y >= 0+level) {
                result.get(x).set(y--,i++);
            }
            y++;
            x--;
            level++;

            while (x >= 0+level) {
                result.get(x--).set(y,i++);
            }
            x++;
            y++;
        }
        return result;
    }
}
