/*
1047. Remove All Adjacent Duplicates In String

https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
*/

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);
        remove(sb);
        return sb.toString();
    }

    public void remove(StringBuilder sb){
        if(sb.isEmpty()){
            return;
        }
        
        for(int i = 0; i < sb.length() - 1; i++){
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i+1);
            if(c1 == c2){
                sb.delete(i, i+2);
                i=i==0?i-1:i-2;
            }
        }
    }
}
