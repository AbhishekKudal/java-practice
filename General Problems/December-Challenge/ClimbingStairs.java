/*
70. Climbing Stairs -- Fiboacci Series

https://leetcode.com/problems/climbing-stairs/description/
*/

class Solution {
    public int climbStairs(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int first = 1;
        int second = 2;
        int ans = 0;
        
        for(int i = 2; i < n; i++){
            ans = first + second;
            first = second;
            second = ans;
        }
        return ans;
    }
}
