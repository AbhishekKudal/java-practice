/*
1790. Check if One String Swap Can Make Strings Equal

https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
*/

import java.util.*;

class StringSwap {
    public boolean areAlmostEqual(String s1, String s2) {
        int nonEqual = 0;
        // int s1Sum = 0;
        // int s2Sum = 0;
        String r1 = "";
        String r2 = "";
        
        
        for(int i = 0; i < s1.length() ; i++){
            // s1Sum += s1.charAt(i);
            // s2Sum += s2.charAt(i);
            
            
            if(s1.charAt(i) != s2.charAt(i)){
                r1 = r1 + s1.charAt(i);
                r2 = r2 + s2.charAt(i);
                nonEqual++;
            }
        }
        
        char[] first = r1.toCharArray();
        char[] second = r2.toCharArray();
        
        Arrays.sort(first);
        Arrays.sort(second);
  
        if((nonEqual == 0 || nonEqual == 2) && Arrays.equals(first, second)){
            return true;
        }
        
        return false;
    }
}
