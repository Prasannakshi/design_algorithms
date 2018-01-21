package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Prasannakshi on 3/28/2017.
 */
public class addland {
    public static void main(String args[]){
        int[][] positions = {{0,0},{1,0},{0,2},{1,2},{2,1}};
        List<Integer> result = getisland(3,3,positions);
        for(Integer i: result){
            System.out.print(i+",");
        }
    }

    private static List<Integer> getisland(int m, int n, int[][] positions) {
        int[] rootArray = new int[m*n];
        Arrays.fill(rootArray,-1);

        ArrayList<Integer> result = new ArrayList<Integer>();

        int[][] directions = {{-1,0},{0,1},{1,0},{0,-1}};
        int count=0;

        for(int k=0; k<positions.length; k++){
            count++;

            int[] p = positions[k];
            int index = p[0]*n+p[1];
            rootArray[index]=index;//set root to be itself for each node

            for(int r=0;r<4;r++){
                int i=p[0]+directions[r][0];
                int j=p[1]+directions[r][1];

                if(i>=0&&j>=0&&i<m&&j<n&&rootArray[i*n+j]!=-1){
                    //get neighbor's root
                    int thisRoot = getRoot(rootArray, i*n+j);
                    if(thisRoot!=index){
                        rootArray[thisRoot]=index;//set previous root's root
                        count--;
                    }
                }
            }

            result.add(count);
        }

        return result; 
    }

    private static int getRoot(int[] arr, int i) {
        while(i!=arr[i]){
            i=arr[i];
        }
        return i;
    }
}
