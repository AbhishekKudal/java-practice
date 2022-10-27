/*
 * Quick Sort (Single Pivot)
 * 
 * Complexity:
    * Best case: O(nlog(n))      When Pivot is at the center
    * Worst Case: O(n^2)         When Pivot is at extreme ends (right/left)
 * 
 * Not Stable
 * In-place sorting algorithm
 * Always preferred over merge sort as it does not take auxiliary space like O(n) taken by merge sort 
 * Merge sort is preferred in case of linked list as linked list does not have continuous memory allocation which is the case for Arrays  
 */


import java.util.Arrays;

public class QuickSortUsingRecursion {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;

        int pivot = arr[m];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        //Now as the pivot is at the right index, sort the remaining two parts of the array

        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
