package matrix;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/25/2017.
 */
public class numislands {
    public static void main(String args[]){
        ArrayList<ArrayList<Character>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList('1','0','1')));
        input.add(new ArrayList<>(Arrays.asList('1','1','0')));
        input.add(new ArrayList<>(Arrays.asList('1','1','0')));
        System.out.print(findnum(input));
    }

    private static int findnum(ArrayList<ArrayList<Character>> grid) {
        if(grid==null || grid.size()==0 || grid.get(0).size()==0)
            return 0;

        int m = grid.size();
        int n = grid.get(0).size();

        int[] dx={-1, 1, 0, 0};
        int[] dy={0, 0, -1, 1};

        int[] root = new int[m*n];

        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid.get(i).get(j)=='1'){
//                    int s = i*n+j;
//                    root[s] = s;
                    count++;
                    merge(grid,i,j);
                }
            }
        }

//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                if(grid.get(i).get(j)=='1'){
//                    for(int k=0; k<4; k++){
//                        int x = i+dx[k];
//                        int y = j+dy[k];
//
//                        if(x>=0 && x<m && y>=0 && y<n && grid.get(x).get(y)=='1'){
//                            int cRoot = getRoot(root, i*n+j);
//                            int nRoot = getRoot(root, x*n+y);
//                            if(nRoot!=cRoot){
//                                root[cRoot]=nRoot; //update previous node's root to be current
//                                count--;
//                            }
//
//                        }
//                    }
//                }
//            }
//        }
        return count;
    }

    private static int getRoot(int[] arr, int i) {
        while(arr[i]!=i){
            i = arr[arr[i]];
        }

        return i;
    }

    private static void merge(ArrayList<ArrayList<Character>> grid, int i, int j) {
        int m=grid.size();
        int n=grid.get(0).size();

        if(i<0||i>=m||j<0||j>=n||grid.get(i).get(j)!='1')
            return;

        grid.get(i).set(j,'X');

        merge(grid, i-1, j);
        merge(grid, i+1, j);
        merge(grid, i, j-1);
        merge(grid, i, j+1);
    }
}
