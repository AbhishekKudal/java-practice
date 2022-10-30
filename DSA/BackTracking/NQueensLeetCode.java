/*
51. N-Queens

https://leetcode.com/problems/n-queens/
*/

package BackTracking;

import java.util.*;

public class NQueensLeetCode {
    public static void main(String[] args) {
        System.out.println(solveNQueens(5));
    }

    public static List<List<String>> solveNQueens(int n) {
        boolean board[][] = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        nQueens(board, 0, ans);
        return ans;
    }

    public static void nQueens(boolean board[][], int row, List<List<String>> ans) {
        if (row == board.length) {
            ans.add(insert(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if(isSafe2(board, row, col)){
                board[row][col] = true;
                nQueens(board, row + 1, ans);
                board[row][col] = false;
            }
        }

        // return;
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

        //Checking straight upwords
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        //Checking left diagonal
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - 1][col - 1]){
                return false;
            }
        }

        //Checking right diagonal
        int maxRight = Math.min(row,board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - 1][col + 1]){
                return false;
            }
        }

        return true;
    }

    private static List<String> insert(boolean[][] board) {
        List<String> ans = new ArrayList<>();

        for (boolean[] row : board) {
            StringBuilder eachRow = new StringBuilder();
            for (boolean element : row) {
                if (element == true) {
                    eachRow.append("Q");
                } else {
                    eachRow.append(".");
                }
            }
            ans.add(eachRow.toString());
        }
        return ans;
    }

}
