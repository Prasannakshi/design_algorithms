import java.util.Scanner;

/**
 * Created by Prasannakshi on 2/26/2017.
 */
public class diagonal {
    public static void main(String[] args) {
        int first = 0, second = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j) {
                    first += a[a_i][a_j];
                }
                if (a_j == n - a_i) {
                    second += a[a_i][a_j];
                }
            }
        }
        System.out.println(Math.abs(first - second));
    }
}
