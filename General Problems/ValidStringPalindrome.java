/*
125. Valid Palindrome

https://leetcode.com/problems/valid-palindrome/
*/

class ValidStringPalindrome {
     public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        for(int i = 0, j = sb.length() - 1; i < sb.length() - 1;){
            if((sb.charAt(i) >= 97 && sb.charAt(i) <= 122) || (sb.charAt(i) >= 48 && sb.charAt(i) <=57)){
                if( (sb.charAt(j) >= 97 &&  sb.charAt(j) <= 122) || (sb.charAt(j) >= 48 && sb.charAt(j) <=57)){
                    if(sb.charAt(i) != sb.charAt(j)){
                        return false;
                    }
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }
        return true;
    }
}
