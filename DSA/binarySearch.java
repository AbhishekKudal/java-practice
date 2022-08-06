//Search a given element in an Sorted Ascending Array; if found return its index else return -1

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,9,10,15,18,21,26};
        int target = 10;
        System.out.println(search(arr, target));
    }

    static int search(int arr[], int target){
        int start = 0;
        int end = arr.length;
        while(start<end){
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
