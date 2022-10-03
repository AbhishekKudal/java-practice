/*
1572. Matrix Diagonal Sum

https://leetcode.com/problems/matrix-diagonal-sum/
*/

class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int row = 0; row < mat.length; row++){
            sum += mat[row][row];
        }
        for(int row = 0; row < mat.length; row++){
            sum += mat[row][mat[0].length - 1 - row];
        }
        if(mat.length % 2 != 0){
            return sum - mat[(mat.length-1) / 2][(mat.length-1) / 2];
        }
        return sum ;
    }
}
