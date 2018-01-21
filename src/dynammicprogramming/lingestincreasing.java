package dynammicprogramming;

/**
 * Created by Prasannakshi on 11/9/2017.
 */
public class lingestincreasing {
    public static int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = x;
            if (i == size) ++size;
        }
        return size;
    }
    public static void main(String args[]){
        int[] inp = {9,1,6,7,2,10,20};
        int resu = lengthOfLIS(inp);
    }
}
