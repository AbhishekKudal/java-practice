package CyclicSort;

import java.util.Arrays;

class FindAllDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;           //index = value - 1;
            if(i != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
    }
    
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
