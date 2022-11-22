/*
349. Intersection of Two Arrays

https://leetcode.com/problems/intersection-of-two-arrays/description/
*/

class Solution {
 public  int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : nums1){
            set.add(i);
        }

        Set<Integer> intersection = new HashSet<Integer>();
        for (int i : nums2){
            if(set.contains(i)){
                intersection.add(i);
            }
        }

        int nums[] = new int[intersection.size()];
        int k = 0;
        for(int i : intersection){
            nums[k++] = i;
        }

        return nums;
    }
}
