package arraylist;

import java.util.HashMap;

/**
 * Created by Prasannakshi on 1/16/2017.
 */
public class sumcalculate {
    /**Runtime - O(n) Because of using hashmap**/
    public static int[] twoSum1(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index ;
                result[1] = i;
                break;
            } else {
                map.put(target - numbers[i], i);
            }
        }

        return result;
    }
    public static int[] twoSum2(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0)
            return null;
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int x = numbers[i] + numbers[j];
            if (x < target) {
                ++i;
            } else if (x > target) {
                j--;
            } else {
                return new int[] { i + 1, j + 1 };
            }
        }
        return null;
    }
    /**This is using Hashmap creating a data structure and elegant solution**/
    private static HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();

    public static void add(int number) {
        if (elements.containsKey(number)) {
            elements.put(number, elements.get(number) + 1);
        } else {
            elements.put(number, 1);
        }
    }

    public static boolean find(int value) {
        for (Integer i : elements.keySet()) {
            int target = value - i;
            if (elements.containsKey(target)) {
                if (i == target && elements.get(target) < 2) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        add(2);
        add(4);
        add(10);
        find(12);
//        int[] sum = new int[2];
//        int[] numbers = {2,4,10,9,14,19};
//        int target = 16;

//        sum = twoSum2(numbers,target);
//        for(int s:sum){
//        System.out.println(s);
//        }
    }
    /**Runtime - n^2 **/
    public static int[] mytwoSum(int[] numbers, int target){
        int j = numbers.length-1;
        int[] result = new int[2];
        for(int i=0;i<numbers.length;i++){
            while(j>i) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                    break;
                } else {
                    j--;
                }
            }
        }
        return result;
    }
}
