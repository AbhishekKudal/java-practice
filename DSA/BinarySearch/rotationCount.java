//(Q.10)Find the rotation count for a rotated sorted Array using binary search

public class rotationCount {
    public static void main(String[] args) {
        int[] arr = {10,12,14,15,16,2,3,4,8}; 
        System.out.println(pivot(arr)+1);
    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if(start >= mid){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;      //Array is not rotated
    }
}
