package matrix;

/**
 * Created by Prasannakshi on 4/1/2017.
 */
public class increasingsequence {
    public static void main(String args[]){
        int[][] input = new int[][]{{'9','0','1'},{'7','2','3'},{'6','4','5'}};
        System.out.print(maxincrease(input));
    }

    private static int maxincrease(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return 0;

        int[][] mem = new int[matrix.length][matrix[0].length];
        int longest=0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                longest = Math.max(longest, dfs(matrix, i, j, mem));
            }
        }

        return longest;
    }

    private static int dfs(int[][] matrix, int i, int j, int[][] mem) {
        if(mem[i][j]!=0)
            return mem[i][j];

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for(int m=0; m<4; m++){
            int x = i+dx[m];
            int y = j+dy[m];

            if(x>=0&&y>=0&&x<matrix.length&&y<matrix[0].length&&matrix[x][y]>matrix[i][j]){
                mem[i][j]=Math.max(mem[i][j], dfs(matrix, x, y, mem));
            }
        }

        return ++mem[i][j];
    }
}
