package myself;

import java.util.HashMap;

/**
 * Created by Prasannakshi on 10/10/2017.
 */
public class findsubstring {
    static HashMap<Character, Integer> target;
    static String getShortestUniqueSubstring(char[] arr, String str) {
        // your code goes here
        String result = "";
        target = new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
            if(target.containsKey(arr[i])){
                target.put(arr[i],target.get(arr[i]+1));
            } else {
                target.put(arr[i],0);
            }
        }
        int left = 0;
        int count =0;
        for(int j=0;j<str.length()-1;j++){
            if(target.containsKey(str.charAt(j))){
                count++;
            }

        }
        String[] input = str.split("");
        for(int i=0;i<=input.length-1;i++){
            System.out.print(input[i]);
        }

        return result;


    }

    public static void main(String[] args) {
        char[] arr = {'x','y','z'};
        String str = "xyyzyzyx";
        String result = getShortestUniqueSubstring(arr,str);
    }
}
