package bitmanipulation;

/**
 * Created by Prasannakshi on 11/15/2017.
 */
public class alternatingcurrent {
    static boolean hasAlternatingBits(int n) {
        int prev = n & (1);
        n >>= 1;
        while(n > 0) {
            int s = (n & 1) ^ prev;
            if(s == 0) return false;
            prev = n & 1;
            n >>= 1;
        }
        return true;
    }
    public static void main(String args[]){
        boolean result = hasAlternatingBits(11);
    }
}
