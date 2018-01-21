package bfsdfsbbt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasannakshi on 12/18/2017.
 */
public class permutatioseq {
    public static String getPermutation(int n, int k) {
        List<Integer> input = new ArrayList<Integer>();
        for(int i=1;i<=n;i++){input.add(i);}
        int[] fact = new int[n];
        fact[0] = 1;
        for(int i=1;i<n;i++){fact[i] = i*fact[i-1];}
        k--;
        StringBuilder answer = new StringBuilder();
        for(int len=n;len>0;len--){
            int index = k/fact[len-1];
            k = k%fact[len-1];
            answer.append(input.get(index));
            input.remove(index);
        }
        return answer.toString();
    }
    public static void main(String args[]){
        String result = getPermutation(1,1);
    }
}
