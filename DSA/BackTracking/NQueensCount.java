/*
52. N-Queens II

https://leetcode.com/problems/n-queens-ii/
*/


package BackTracking;

public class NQueensCount {

    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }

    public static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return nQueens(board, 0);
    }
    
    public static int nQueens(boolean[][] board, int row){
        if(row == board.length){
            return 1;
        }
        
        int count = 0;
        
        for(int col = 0; col < board[0].length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += nQueens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    public static boolean isSafe(boolean[][] board, int row, int col){
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col]){
                return false;
            }
        }
        
        int i = row;
        int j = col;
        while(i >= 0 && j >= 0){
            if(board[i][j]){
                return false;
            }
            i--;
            j--;
        }
        
        while(row >= 0 && col < board[0].length){
            if(board[row][col]){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
}
