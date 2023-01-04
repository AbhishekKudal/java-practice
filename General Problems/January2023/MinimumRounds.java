/*
2244. Minimum Rounds to Complete All Tasks

https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/
*/

class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : tasks){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int res = 0;

        for (int freq : map.values()) {
            if (freq == 1) return -1;
            res += (freq + 2) / 3;
        }
        return res;
        
    }
}
