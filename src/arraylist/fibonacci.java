/**
 * Created by Prasannakshi on 11/13/2016.
 */
public class fibonacci {
    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1)) // base cases
            return number;
        else
            // recursion step
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        for (int counter = 0; counter <= 20; counter++)
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
    }
}
