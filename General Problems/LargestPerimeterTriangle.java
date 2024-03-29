/*
976. Largest Perimeter Triangle

https://leetcode.com/problems/largest-perimeter-triangle/
*/

import java.util.Arrays;

class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        
        for(int i = nums.length - 1; i > 1; i--){
            if(nums[i] < nums[i-1] + nums[i-2]){
                max = Math.max(nums[i] + nums[i-1] + nums[i-2] , max);
            }
        }
        return max;
    }
}
