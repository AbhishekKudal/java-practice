/*
** Insertion Sort:
(Bubble Sort version 2.0)

*** Sort in Parts ***

 * Time complexity: Worst case = O(n^2)
 *                  Best case = O(n)        As we are breaking the loop if array is sorted
 * 
 * Used because: 1. Adaptive - Steps are reduced if array is sorted
 *               2. Stable
 *               3. Used for smaller values of n when array is partially sorted
 *               4. Takes part in hybrid sorting algorithms
 */

import java.util.*;

public class InsertionSort {
    public static void main(String args[]) {
      int[] arr = {5,4,3,2,1};
      sort(arr);
      System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j - 1);
                }else{
                    break;
                }
            }
        }
    }
    
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
