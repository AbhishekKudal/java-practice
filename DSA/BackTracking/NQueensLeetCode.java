/*
51. N-Queens

https://leetcode.com/problems/n-queens/
*/

package BackTracking;

public class NQueensLeetCode {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    private static int queens(boolean[][] board, int row){
        if( row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        
        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            if(isSafe2(board, row, col)){
                board[row][col] = true;
                count = count + queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }
    
    //Understanding simplified
    private static boolean isSafe2(boolean[][] board, int row, int col) {

        // check vertical row
        for (int i = row - 1; i >= 0; i--) {
            if(board[i][col] == true){
                return false;
            }
        }

        //check left diagonal

        int i = row;                        //Storing the values in local variable as we need to use them again in below while loop
        int j = col;
        while(i >= 0 && j >= 0){
            if(board[i][j]){
                return false;
            }
            i--;
            j--;  
        }

        //check right diagonal
        while(row >= 0  && col < board[0].length){
            if(board[row][col]){
                return false;
            }
            row--;
            col++;
        }

        return true;
    }

    //Kunal's code
    private static boolean isSafe(boolean[][] board, int row, int col) {

        // check vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col] == true){
                return false;
            }
        }

        //check left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i]){
                return false;
            }
        }

        //check right diagonal
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board){
            for (boolean element : row) {
                if(element == true){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
