package arraylist;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Prasannakshi on 4/2/2017.
 */
public class slidingwindow {
    public static void main(String args[]){
        int[] input = {4,2,5,3,7,9};
        int[] result = maxslidingwindow(input,3);
    }

    private static int[] maxslidingwindow(int[] a, int k) {
        if(a == null || a.length == 0) return new int[] {};
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int[] result = new int[a.length - k + 1];
        int count = 0;
        for (int i = 0; i < a.length - k + 1; i++) {
            for (int j = i; j < i + k; j++) {
                pq.offer(a[j]);
            }
            result[count] = pq.poll();
            count = count + 1;
            pq.clear();
        }
        return result;
    }
}
