//Find out index of given number in an infinite array, i.e. you cannot use the length of the array.


public class binarySearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,5,8,10,13,15,16,18,22,58,125,126,128,130,145,156,160,166,180,200,800,1000};
        int target = 16;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start +1)*2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    } 

    static int binarySearch(int[] arr, int target, int start, int end){
        // int mid = (start + end)/2;

        while(start <= end){
            int mid = start + (end - start)/2;      

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
