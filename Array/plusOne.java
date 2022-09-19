//66. Plus One

//https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for(int i = n - 1; i >= 0; i--){
            if(digits[i] < 9){      //if last digit is less than nine increment that index and return the Array
                digits[i] ++;
                return digits;
            }
            
            digits[i] = 0;          //As last index has value 9, set it to 0 and at the next step in the for loop its previous index will automatically get incremented
        }
        // If we does not get the answe even after completing the for loop - It means that we have all index value == 9 and later got set to 0 inside the for loop
        
        // create a new array of one extra size, put 0th element == 1 and return it
        int[] newArray = new int[n + 1];
        newArray[0] = 1;
        return newArray;
    }
}
