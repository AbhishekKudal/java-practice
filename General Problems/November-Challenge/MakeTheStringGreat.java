/*
1544. Make The String Great

https://leetcode.com/problems/make-the-string-great
*/

class MakeTheStringGreat {
    public String makeGood(String s) {
        if(s.isEmpty()){
            return s;
        }

        for(int i = 0; i < s.length() - 1; i++){
            if(Math.abs(s.charAt(i) - s.charAt(i+1)) == 32){
                String n = s.substring(0,i) + s.substring(i+2, s.length());
                return makeGood(n);
            }
        }
        return s;
    }
}
