package leetcode_Amazon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasannakshi on 4/27/2017.
 */
public class allanagram {

    public static void main(String args[]){
        List<Integer> result = findAnagrams("ecbabcabacd","abc");
        for(Integer i: result){
            System.out.print(i);
        }
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
        int[] hash = new int[256];
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (hash[s.charAt(right++)]-- >= 1) count--;
            if (count == 0) list.add(left);
            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
        }
        return list;
    }
}
