/*
1822. Sign of the Product of an Array

https://leetcode.com/problems/sign-of-the-product-of-an-array/
*/

class SignOfTheProductOfArray {
    public int arraySign(int[] nums) {
        int product = 1;
        for(int i = 0; i<= nums.length - 1; i++){
            if(product * nums[i] > 0){
                product = 1;
            }else if(product * nums[i] < 0){
                product = -1;
            }else{
                return 0;
            }
        }
        return product;
    }
}
