package CyclicSort;

// 287. Find the Duplicate Number

// https://leetcode.com/problems/find-the-duplicate-number

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,4,2,1};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        
        while(i < nums.length){
            if(nums[i] != i+ 1){
                int correctIndex = nums[i] - 1;     //correct index for any index of i
                if(nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);    //rat le
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
