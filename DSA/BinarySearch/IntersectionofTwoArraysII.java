/*
350. Intersection of Two Arrays II

https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : nums1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
