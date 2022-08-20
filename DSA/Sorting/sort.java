/*
 * Complexity: Best Case = Worst Case = O(n^2)
 * Works well for small lists/arrays
 */
import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) {
      int[] arr = {4,5,1,2,3};
      sort(arr);
      System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            //find the max in remaining array and swap it with correct index

            int lastIndex = arr.length - 1 - i;                        //respective last index to swap
            int maxIndex = getMaxIndex(arr, 0, lastIndex);      //respective max value to swap
            swap(arr, maxIndex, lastIndex);
        }
    }
    
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
