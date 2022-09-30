/*
1342. Number of Steps to Reduce a Number to Zero

https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

Leetcode approach (Two methods used as we cannot change the method given by LeetCode)
*/

class Solution {
    public int numberOfSteps(int num) {
        return countSteps(num, 0);
    }
    
    static int countSteps(int n, int count){
        if(n == 0){
            return count;
        }
        
        if(n % 2 == 0) {
            return countSteps(n/2, count +1);
        }
        
        return countSteps(n - 1, count + 1);
    }
}
