/*
// 169. Majority Element

// https://leetcode.com/problems/majority-element
*/


class MajorityElement {
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        int target = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
                if (count > nums.length / 2) {
                    return nums[i];
                }
            } else {
                count = 1;
                target = nums[i];
            }
        }
        return 0;
    }
}
