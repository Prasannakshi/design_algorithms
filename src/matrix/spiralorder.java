package matrix;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/18/2017.
 */
public class spiralorder {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        input.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        input.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
        input.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
        ArrayList<Integer> output = findspiral(input);
        for(Integer i: output){
            System.out.print(i);
        }
    }

    private static ArrayList<Integer> findspiral(ArrayList<ArrayList<Integer>> input) {
        ArrayList<Integer> result = new ArrayList<>();
        int m = input.size(),n = input.get(0).size();
        int x=0,y=0;

        if(input==null || m==0){
            return result;
        }

        while (m>0&&n>0){
            if(m==1){
                for(int i=0;i<n;i++){
                    result.add(input.get(x).get(y++));
                }
                break;
            }

            if(n==1){
                for(int i=0;i<m;i++){
                    result.add(input.get(x++).get(y));
                }
                break;
            }

            //top - move right
            for(int i=0;i<n-1;i++){
                result.add(input.get(x).get(y++));
            }

            //right - move down
            for(int i=0;i<m-1;i++){
                result.add(input.get(x++).get(y));
            }

            //bottom - move left
            for(int i=0;i<n-1;i++){
                result.add(input.get(x).get(y--));
            }

            //left - move up
            for(int i=0;i<m-1;i++){
                result.add(input.get(x--).get(y));
            }

            x++;
            y++;
            m=m-2;
            n=n-2;
        }
        return result;
    }
}
