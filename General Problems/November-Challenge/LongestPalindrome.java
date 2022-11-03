/*
2131. Longest Palindrome by Concatenating Two Letter Words

https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/
*/

class LongestPalindrome {
    public int longestPalindrome(String[] words) {
        int max = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String word : words){
            String flipped = "" + word.charAt(1) + word.charAt(0);
            
            if(map.containsKey(flipped)){
                max = max + 4;
                map.put(flipped, map.get(flipped) - 1);
                if(map.get(flipped) == 0){
                    map.remove(flipped);
                }
            }else{
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        
        //now checking for all repeat characters eg.aa, bb
        for(int i = 0; i < 26; i++){
            char current = (char) ('a' + i);
            if(map.getOrDefault("" + current + current ,  0) > 0){
                max += 2;
                break;
            }
        }
        
        return max;
    }
}
