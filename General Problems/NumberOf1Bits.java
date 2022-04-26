/*
191. Number of 1 Bits

https://leetcode.com/problems/number-of-1-bits/submissions/
*/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        
        while(n != 0) {
            int mask = 1;
            if((n & mask) != 0) count++;
            n >>>= 1;
        }
        return count;

    }
}
