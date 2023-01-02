/*
520. Detect Capital

https://leetcode.com/problems/detect-capital/description/
*/


class Solution {
    public boolean detectCapitalUse(String word) {
        char[] arr = word.toCharArray();
        
        if(arr.length == 1){
            return true;
        }

        if (arr[0] <= 90) {
            // first letter is capital
            if (arr[1] <= 90) {
                for (char ch : arr) {
                    if (ch > 90) {
                        return false;
                    }
                }
            } else{
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < 97) {
                        return false;
                    }
                }
            }
        } else {
            // first letter is small
            for (char ch : arr) {
                if (ch < 97) {
                    return false;
                }
            }
        }

        return true;
    }
}
