public class ceilingAndFloorArray {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,9,10,15,18,21,26};
        int target = 11;
        System.out.println("Ceiling of target is "+ ceiling(arr, target));
        System.out.println("Floor of target is " + floor(arr, target));
        // ceiling(arr, target);
    }
    static int ceiling(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }

    static int floor(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
