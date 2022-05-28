/*
1672. Richest Customer Wealth

https://leetcode.com/problems/richest-customer-wealth/
*/

class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int ans = 0;
        for(int row = 0; row < accounts.length; row++){
            for(int j = 0; j < accounts[0].length ; j++){
                sum = sum + accounts[row][j];
            }
            if(ans < sum){
                ans = sum;
            }
            sum = 0;
        }
        return ans;
    }
}
