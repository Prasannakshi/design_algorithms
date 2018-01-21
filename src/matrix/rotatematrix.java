package matrix;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/21/2017.
 */
public class rotatematrix {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        input.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
        input.add(new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
        input.add(new ArrayList<Integer>(Arrays.asList(9,10,11,12)));
        input.add(new ArrayList<Integer>(Arrays.asList(13,14,15,16)));
        ArrayList<ArrayList<Integer>> output = rotatemat(input);
        for(ArrayList<Integer> i:output){
            for(Integer j:i){
                System.out.print(j+",");
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> rotatemat(ArrayList<ArrayList<Integer>> input) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        int m=input.size(),n=input.get(0).size(),level =0;
        int x=0,y=0;
        if(input==null || m==0){
            return result;
        }

        for(int i=0;i<m;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                temp.add(0);
            }
            result.add(temp);
        }

        while(m>0&&n>0){
            if(m==1 && n==1){
                result.get(x).set(y,input.get(x).get(y));
            }

            for(int i=0;i<n-1;i++){
                int temp = input.get(x).get(y);
                result.get(x).set(++y,temp);
            }

            for(int i=0;i<m-1;i++){
                int temp = input.get(x).get(y);
                result.get(++x).set(y,temp);
            }

            for(int i=n-1;i>0;i--){
                int temp = input.get(x).get(y);
                result.get(x).set(--y,temp);
            }

            for(int i=m-1;i>0;i--){
                int temp = input.get(x).get(y);
                result.get(--x).set(y,temp);
            }
            m=m-2;
            n=n-2;
            x++;
            y++;
        }

        return result;
    }
}
