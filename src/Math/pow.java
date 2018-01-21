package Math;

/**
 * Created by Prasannakshi on 10/9/2017.
 */
public class pow {
    public static void main(String args[]){
        boolean result = isPowerOfTwo(8);
    }
//    public static boolean isPowerOfTwo(int n) {
//        if(n<=0)
//            return false;
//
//        while(n>2){
//            int t = n>>1;
//            int c = t<<1;
//
//            if(n-c != 0)
//                return false;
//
//            n = n>>1;
//        }
//
//        return true;
//    }
    public static boolean isPowerOfTwo(int n) {

        return n>0 && (n&n-1)==0;
    }
}
