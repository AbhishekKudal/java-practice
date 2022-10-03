/*
58. Length of Last Word

https://leetcode.com/problems/length-of-last-word/
*/


class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length() - 1 ; i >= 0; i--){
            if(s.charAt(i) != ' '){
                count++;        //found a valid char, increment the count
            }else{
                if(count > 0){
                    return count;
                }
            }
        }
        return count;
    }
}

class LengthOfLastWord2 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                continue;
            }
            if(s.charAt(i) != ' '){
                count++;
            }
            if(i == 0 || s.charAt(i) != ' ' && s.charAt(i-1) == ' '){
                break;
            }
        }
        return count;
    }
}
