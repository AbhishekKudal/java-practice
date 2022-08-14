//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

/*
34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
*/

import java.util.Arrays;

public class firstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchEngine(arr, target)));
    }

    static int[] searchEngine(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = binarySearch(arr, target, true);
        ans[1] = binarySearch(arr, target, false);
        return ans;
    }

    static int binarySearch(int[] arr, int target, boolean startIndex){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                ans = mid;
                if(startIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
