// Order dependent binary search

public class binarySearchOrderAgnostic {
    public static void main(String[] args) {
        // int[] arr = {1,5,6,7,8,9,10,12,45,48,50};
        int[] arr = {50,48,45,12,10,9,8,7,6,5,1};
        int target = 1;
        boolean isAsc = arr[0]<arr[arr.length-1] ;
        System.out.println(search(arr, target, isAsc));
    }

    static int search(int[] arr, int target, boolean isAsc){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = (start + end)/2;

            if(target == arr[mid]){
                return mid;
            }
            
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }else if(target<arr[mid]){
                    end = mid-1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid - 1;
                }else if(target<arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
