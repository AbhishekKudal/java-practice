package CyclicSort;

public class MissingNumber {
    public static void main(String args[]) {
      int[] arr = {4,5,3,2,1};
      System.out.println(missingNumber1(arr));
    }
    
    //Using cyclic sort
    static int missingNumber1(int[] nums){
        int i = 0;
        while(i < nums.length){
            
            int current = nums[i];      //value at particular index

            if(nums[i] < nums.length && nums[i] != nums[current]){
                swap(nums, i, current);
            }else{
                i++;
            }
        }
        
        for(int j = 0; j < nums.length ; j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }

        public int missingNumber2(int[] nums) {
        int i = 0;
        
        while(i < nums.length){
            int presentValue = nums[i];      //value at present index
            
            if(nums[i] < nums.length && presentValue != i){
                swap(nums, presentValue, i);
            }else{
                i++;
            }
        }
        
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    
    
    public int missingNumber3(int[] nums) {

        int n = nums.length;
        int sum = n*(n+1)/2;
        int actualSum = 0;
        for(int num: nums){
            actualSum = actualSum + num;
        }
        return sum - actualSum;
    }
    
    //To swap the values at given index
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
