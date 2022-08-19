/*https://leetcode.com/problems/binary-search/

**Search a given element in an Sorted Ascending Array; if found return its index else return -1

Question: Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
          If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1

*/

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,9,10,15,18,21,26};
        int target = 10;
        System.out.println(search(arr, target));
    }

    static int search(int arr[], int target){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = (start + end)/2;
            if(target>arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
