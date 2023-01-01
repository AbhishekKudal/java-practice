/*
290. Word Pattern

https://leetcode.com/problems/word-pattern/description/
*/

class Solution {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");

        if(arr.length != pattern.length()){
            return false;
        }

        for(int i = 0; i < arr.length; i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(! map.get(ch).equalsIgnoreCase(arr[i])){
                    return false;
                }
            }else{
                if(map.containsValue(arr[i])){
                    return false;
                }
                map.put(ch, arr[i]);
            }
        }
        return true;
    }
}
