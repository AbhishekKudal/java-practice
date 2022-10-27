//Google Question

//17. Letter Combinations of a Phone Number

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

package permutations;

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        System.out.println(combo("", "79"));
    }

    private static ArrayList<String> combo(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();

        int start = 0;
        int end = 0;

        if(digit == 7){
            start = (digit - 2) * 3;
            end = (digit - 1) * 3 + 1;
        }else if(digit == 8){
            start = (digit - 2) * 3 + 1;
            end = (digit - 1) * 3 + 1;
        }else if(digit == 9){
            start = (digit - 2) * 3 + 1;
            end = (digit - 1) * 3 + 2;
        }else{
            start = (digit - 2) * 3;
            end = (digit - 1) * 3;
        }

        for(int i = start; i < end; i++){
            char ch = (char) ('a' + i);
            ans.addAll(combo(p + ch, up.substring(1)));
        }
        return ans;
    }
}
