/*
472. Concatenated Words

https://leetcode.com/problems/concatenated-words/description/

Explanation: https://leetcode.com/problems/concatenated-words/solutions/3103514/simple-recursion-and-optimization-java-c/
*/

class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> set = new HashSet<>();
        List<String> answer = new ArrayList<>();

        for(String word : words){
            set.add(word);
        }

        for(String word : set){
            if(checkConcatenated(word, set) == true){
                answer.add(word);
            }
        }

        return answer;
    }

    public boolean checkConcatenated(String word, Set<String> set){
        for(int i = 1; i < word.length() ; i++){
            String prefix = word.substring(0, i);
            String suffix = word.substring(i, word.length());

            if(set.contains(prefix) && (set.contains(suffix) || checkConcatenated(suffix, set))){
                return true;
            }
        }
        return false;
    }
}
