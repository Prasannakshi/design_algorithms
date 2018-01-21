package bfsdfsbbt;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Prasannakshi on 12/19/2017.
 */
public class Nqueens {private static final Set<Integer> occupiedCols = new HashSet<Integer>();
    private static final Set<Integer> occupiedDiag1s = new HashSet<Integer>();
    private static final Set<Integer> occupiedDiag2s = new HashSet<Integer>();
    public static int totalNQueens(int n) {
        return totalNQueensHelper(0, 0, n);
    }

    private static int totalNQueensHelper(int row, int count, int n) {
        for (int col = 0; col < n; col++) {
            if (occupiedCols.contains(col))
                continue;
            int diag1 = row - col;
            if (occupiedDiag1s.contains(diag1))
                continue;
            int diag2 = row + col;
            if (occupiedDiag2s.contains(diag2))
                continue;
            // we can now place a queen here
            if (row == n - 1)
                count++;
            else {
                occupiedCols.add(col);
                occupiedDiag1s.add(diag1);
                occupiedDiag2s.add(diag2);
                count = totalNQueensHelper(row + 1, count, n);
                // recover
                occupiedCols.remove(col);
                occupiedDiag1s.remove(diag1);
                occupiedDiag2s.remove(diag2);
            }
        }

        return count;
    }
    public static void main(String args[]){
        int result = totalNQueens(4);
    }
}
