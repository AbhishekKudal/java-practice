import java.util.Arrays;

//https://leetcode.com/problems/check-if-n-and-its-double-exist/
/*
1346. Check If N and Its Double Exist
*/

public class checkIfNumberAndDoubleExists {
    public static void main(String[] args) {
        int[] nums = {5,2,10,6};
        System.out.println(checkIfExist(nums));
    }

    static boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(binarySearch(arr, arr[i]*2 , i)){
                return true;
            }
        }
        return false;
    }
    static boolean binarySearch(int[] arr, int target, int index) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target && mid != index){
                return true;
            }

            if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
