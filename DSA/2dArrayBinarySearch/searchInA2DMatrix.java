/*
https://leetcode.com/problems/search-a-2d-matrix/

74. Search a 2D Matrix
Medium

Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

    Integers in each row are sorted from left to right.
    The first integer of each row is greater than the last integer of the previous row.
 */

public class searchInA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target = 16;
        System.out.println(searchMatrix(matrix, target));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            
            if(matrix[row][col] > target){
                col --;
            }else{
                row++;
            }
        }
        return false;
    }
}
