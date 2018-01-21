package Math;

/**
 * Created by Prasannakshi on 10/9/2017.
 */
public class trailingzeros {
    public static void main(String args[]){
        int res = trailingZeroes(40);
    }
    public static int trailingZeroes(int n) {
        if (n < 0)
            return -1;

        int count = 0;
        for (long i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        return count;
    }

}
