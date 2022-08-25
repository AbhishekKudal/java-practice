/*
https://leetcode.com/problems/peak-index-in-a-mountain-array/
*/

public class PeakElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,6,3};
        System.out.println(peakElementInMountainArray.search(arr));
    }

    static int search(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2 ;

            if(start == end){
                return arr[start];
            }

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
        }
        return 0;
    }
}
