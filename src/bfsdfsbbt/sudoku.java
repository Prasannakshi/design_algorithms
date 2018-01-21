package bfsdfsbbt;

/**
 * Created by Prasannakshi on 11/12/2017.
 */
public class sudoku {
    public static void main(String args[]){
        char[][] input = {{'.','.','9','7','4','8','.','.','.'},{'7','.','.','.','.','.','.','.','.'},{'.','2','.','1','.','9','.','.','.'},{'.','.','7','.','.','.','2','4','.'},{'.','6','4','.','1','.','5','9','.'},{'.','9','8','.','.','.','3','.','.'},{'.','.','.','8','.','3','.','2','.'},{'.','.','.','.','.','.','.','.','6'},{'.','.','.','2','7','5','9','.','.'}};
        solveSudoku(input);
    }
    public static void solveSudoku(char[][] board) {
        if(board.length==0 || board==null){
            return;
        }
        solve(board);
    }
    private static boolean solve(char[][] board){
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(valid(board, i, j, c)){
                            board[i][j] = c;
                            if(solve(board)){
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean valid(char[][] board, int row, int col, char val) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.' && board[i][col] == val) return false;
            if (board[row][i] != '.' && board[row][i] == val) return false;
            if (board[3 * (row / 3) + i / 3][3 * ( col/ 3) + i % 3] != '.' && board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == val)
                return false;
        }
        return true;
    }
}
