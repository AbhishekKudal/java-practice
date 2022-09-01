/*
1523. Count Odd Numbers in an Interval Range

https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
*/
class CountOddNumbers {
    public int countOdds(int low, int high) {
        int nums = high - low + 1;
        if(low % 2 == 0 || high % 2 == 0) return nums/2;
        return nums/2 + 1;
    }
}
