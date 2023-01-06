/*
1833. Maximum Ice Cream Bars

https://leetcode.com/problems/maximum-ice-cream-bars/description/
*/

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int currTotal = 0;

        for(int item : costs) {
            if(item <= coins){
                currTotal++;
                coins -= item;
            }else{
                break;
            }
        }

        return currTotal;
    }
}
