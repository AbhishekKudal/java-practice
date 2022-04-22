/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
  For example, 121 is a palindrome while 123 is not.
*/

//First approach

class SimplePalindrome1 {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int remainder = 0;
        int temp = x;
        while(temp>0){
            remainder = temp%10;
            sum = (sum*10)+remainder;
            temp = temp/10;
        }
         if(sum == x){
             return true;
         }
        return false;
    }
}

//Second approach using String

class SimplePalindrome2 {
    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        String reverse = "";
        for(int i=temp.length()-1; i>=0 ; i--){
            reverse = reverse + temp.charAt(i);
        }
        System.out.println(reverse);
        if(reverse.equals(Integer.toString(x))){
            return true;
        }
        return false;
    }
}
