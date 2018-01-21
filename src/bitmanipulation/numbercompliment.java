package bitmanipulation;

/**
 * Created by Prasannakshi on 11/15/2017.
 */
public class numbercompliment {
    public static int findComplement(int num) {
        int a = Integer.highestOneBit(num) - 1;
        int b = ~num;
        return a&b;
    }
    public static void main(String args[]){
        int result = findComplement(7);
    }

}
