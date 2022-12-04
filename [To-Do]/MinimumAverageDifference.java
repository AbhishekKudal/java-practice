/*
2256. Minimum Average Difference

https://leetcode.com/problems/minimum-average-difference/
*/

//Rectify it
class MySolution {
    public int minimumAverageDifference(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int diff = Integer.MAX_VALUE;

        for(int j = 0; j < nums.length; j++){
            int sum1 = 0;
            int i = 0;

            for(; i <= j; i++){
                sum1 = sum1 + nums[i];
            }

            System.out.println("Sum1 is " + sum1);
            System.out.println("i is " + i);

            int avg1 = sum1/i;

            int sum2 = 0;
            int k = i;

            for(;k < nums.length; k++){
                sum2 = sum2 + nums[i];
            }

            System.out.println("Sum2 is " + sum2);
            System.out.println("k is " + k);

            int avg2 = sum2/(k-i);

            int newDiff = Math.abs(avg1 - avg2);

            diff = diff < newDiff ? diff : newDiff;
        }

        return diff;
    }
}

/*Prefix sum method*/

class Solution
{
    public int minimumAverageDifference(int[] nums)
    {
        int N = nums.length, id = 0;
        long min = Integer.MAX_VALUE;
        long[] pre = new long[N];
        pre[0] = nums[0];
        for(int i = 1; i < N; i++)
            pre[i] = pre[i-1]+nums[i];
        for(int i = 0; i < N-1; i++)
        {
            long diff = (long)(Math.abs(Math.round(pre[i]/(i+1) - Math.round((pre[N-1]-pre[i])/(N-i-1)))));
            if(diff < min)
            {
                id = i;
                min = diff;
            }
        }
        if(min > pre[N-1]/N) // Taking all on the first/left
            return N-1;
        return id;
    }
}
