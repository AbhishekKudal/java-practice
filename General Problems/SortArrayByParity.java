/*
905. Sort Array By Parity

https://leetcode.com/problems/sort-array-by-parity/
*/

class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int last = ans.length - 1;
        int first = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                ans[last] = nums[i];
                last--;
            }else{
                ans[first] = nums[i];
                first++;
            }
        }
        return ans;
    }
}
