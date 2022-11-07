/*
1323. Maximum 69 Number

https://leetcode.com/problems/maximum-69-number
*/

class Maximum69Number {
    public int maximum69Number (int num) {
        int last = 0;
        int[] arr = new int[4];
        int ans = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            last = num % 10;
            arr[i] = last;
            num = num / 10;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 6){
                arr[i] = 9;
                break;
            }
        }

        int factor = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans = ans + arr[i] * factor;
            factor = factor * 10;
        }

        return ans;

    }
}
