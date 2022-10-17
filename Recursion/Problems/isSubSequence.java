/*
392. Is Subsequence

https://leetcode.com/problems/is-subsequence/
*/

public class isSubSequence1 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int indexS = 0, indexT = 0;
        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++;
                if (indexS == s.length()) return true;
            }
            indexT++;
        }
        return false;
    }
}

public class isSubSequence2 {

    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubseq(s, t));
    }

    static boolean ans = false;
    public static boolean isSubseq(String s, String t) {
        subSeq(s, "", t);
        return ans;
    }
    
    public static void subSeq(String target, String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            if(p.equals(target)){
                ans = true;
            }
            return; 
        }
        
        char ch = up.charAt(0);
        
        subSeq(target, p + ch, up.substring(1));
        subSeq(target, p, up.substring(1));
    }
}
