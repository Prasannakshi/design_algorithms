package leetcode_Amazon;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Prasannakshi on 5/4/2017.
 */
public class kdiffpairs {
    public static void main(String args[]){
        int[] input = {3, 1, 4, 1, 5};
        System.out.print(findPairs(input,0));
    }
    public static int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        return count;
    }
}
