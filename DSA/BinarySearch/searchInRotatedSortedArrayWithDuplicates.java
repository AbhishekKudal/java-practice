public class searchInRotatedSortedArrayWithDuplicates {
    public static void main(String args[]) {
        int[] arr = {2,8,8,9,2,2,2};
        int target = 8;
        System.out.println("Pivot index is " + findPivot(arr));
        System.out.println("Target = " + target + " Its index = "+ search(arr, target));
    }
    
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        
        if(arr[pivot] == target){
            return pivot;
        }
        
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot);
        }
        
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //Skip the elements
                // Note: What if the start or end is the pivot?
                // Checking if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start ++;
                //Checking if end is pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end --;
                
                //Example to understand below condition: [4,4,4,7,0,1,2]
            }else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]) ){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
