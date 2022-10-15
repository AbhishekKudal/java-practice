/*
905. Sort Array By Parity

https://leetcode.com/problems/sort-array-by-parity/
*/

class SortArrayByParity {
    public int[] sortArrayByParity1(int[] nums) {
        int[] ans = new int[nums.length];
        int last = ans.length - 1;
        int first = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                ans[last] = nums[i];
                last--;
            }else{
                ans[first] = nums[i];
                first++;
            }
        }
        return ans;
    }
    
    
    //Constant space complexity with minimum Runtime
    public int[] sortArrayByParity2(int[] nums) {
        int i = 0;
        int evenCounter = 0;

        while(i < nums.length){

            //wherever you find even number just swap it with evenCounter
            if(nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[evenCounter];
                nums[evenCounter] = temp;   
                evenCounter++;
            }   
            i++;
        }

        return nums;
    }
}
