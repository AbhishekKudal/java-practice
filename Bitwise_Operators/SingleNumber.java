//136. Single Number

//https://leetcode.com/problems/single-number/submissions/

class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
