package CyclicSort;

/*
 * 41. First Missing Positive
 * https://leetcode.com/problems/first-missing-positive/
 * Amazon
 * Given an unsorted integer array nums, return the smallest missing positive integer.

 * You must implement an algorithm that runs in O(n) time and uses constant extra space.
 */

public class FirstMissingPositive {
    public static void main(String[] args) {
        int arr[] = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                return j+1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
