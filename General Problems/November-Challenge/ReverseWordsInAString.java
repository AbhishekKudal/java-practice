/*
151. Reverse Words in a String

https://leetcode.com/problems/reverse-words-in-a-string/
*/

import java.util.*;

class Solution {
     public String reverseWords1(String s) {
         StringTokenizer st = new StringTokenizer(s, " ");
         String ans = "";
         while(st.hasMoreTokens()){
             String next = st.nextToken().trim();
             ans = next + " " + ans;
         }
         return ans.trim();
     }

    public String reverseWords2(String s) {
        String str[] = s.split("\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = str.length - 1; i >= 0; i--){
            sb.append(str[i].trim() + " ");
        }

        return sb.toString().trim();
    }
}
