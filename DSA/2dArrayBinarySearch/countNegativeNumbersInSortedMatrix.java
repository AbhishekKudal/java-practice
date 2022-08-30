/*
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * 1351. Count Negative Numbers in a Sorted Matrix
 * 
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0
 */

public class countNegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                        {4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}
                    };

        System.out.println(countNegatives(matrix));
    }
    static int countNegatives(int[][] grid) {
        int count = 0;
        
        for(int row = 0; row < grid.length; row++){
            int col = grid[0].length - 1;
            while(col >= 0){
                if(grid[row][col] < 0){
                    count++;
                    col--;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}
