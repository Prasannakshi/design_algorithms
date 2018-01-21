package dynammicprogramming;

/**
 * Created by Prasannakshi on 1/8/2018.
 */
public class climbingstars {
    public static void main(String args[]){
        int[] input = {0,0,0,1};
        int res = minCostClimbingStairs(input);
    }
    public static int minCostClimbingStairs(int[] cost) {
        int[] result = new int[cost.length];
        result[0] = cost[0];
        result[1] = cost[1];
        for(int i=2;i<cost.length;i++){
            result[i] = cost[i] + Math.min(result[i-1],result[i-2]);
        }
        return result[cost.length];
    }
}
