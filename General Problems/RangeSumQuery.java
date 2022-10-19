/*
303. Range Sum Query - Immutable

https://leetcode.com/problems/range-sum-query-immutable/
*/

class NumArray {
    int[] nums1;
    public NumArray(int[] nums) {
        this.nums1 = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        
        for(int start = left; start <= right; start ++){
            sum += nums1[start];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
