package CyclicSort;

// 645. Set Mismatch

// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        
        while(i < nums.length){
            int correctIndex = nums[i] - 1;     //correct index for any index of i
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);    //rat le
            }else{
                i++;
            }
        }

        for(int j = 0; j< nums.length; j++){
            if(nums[j] != j + 1){
                return new int[] {nums[j], j+1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
