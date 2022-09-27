/*
1979. Find Greatest Common Divisor of Array

https://leetcode.com/problems/find-greatest-common-divisor-of-array/
*/

import java.util.Arrays;

class GCD {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length - 1]);
    }
    
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        
        return gcd(b % a, a);
    }
}
