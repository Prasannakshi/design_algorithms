package arraylist;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Prasannakshi on 10/15/2017.
 */
public class removedup {
    public static int removeDuplicatesNaive(int[] A) {
        if (A.length < 2)
            return A.length;

        int j = 0;
        int i = 1;

        while (i < A.length) {
            if (A[i] == A[j]) {
                i++;
            } else {
                j++;
                A[j] = A[i];
                i++;
            }
        }

        return j + 1;
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums==null||nums.length<2||k<0||t<0)
            return false;

        TreeSet<Long> set = new TreeSet<Long>();
        for(int i=0; i<nums.length; i++){
            long curr = (long) nums[i];

            long leftBoundary = (long) curr-t;
            long rightBoundary = (long) curr+t+1; //right boundary is exclusive, so +1
            SortedSet<Long> sub = set.subSet(leftBoundary, rightBoundary);
            if(sub.size()>0)
                return true;

            set.add(curr);

            if(i>=k){ // or if(set.size()>=k+1)
                set.remove((long)nums[i-k]);
            }
        }

        return false;
    }
    public static int removeDuplicates(int[] A) {
        if (A == null || A.length == 0)
            return 0;

        int pre = A[0];
        boolean flag = false;
        int count = 0;

        // index for updating
        int o = 1;

        for (int i = 1; i < A.length; i++) {
            int curr = A[i];

            if (curr == pre) {
                if (!flag) {
                    flag = true;
                    A[o++] = curr;

                    continue;
                } else {
                    count++;
                }
            } else {
                pre = curr;
                A[o++] = curr;
                flag = false;
            }
        }

        return A.length - count;
    }
    public static void main(String args[]){
        int[] inp = {1,1,1,3,3,4};
//        int res = removeDuplicatesNaive(inp);
        int res = removeDuplicates(inp);
//        Boolean result = containsNearbyAlmostDuplicate(inp,2,6 );
    }
}
