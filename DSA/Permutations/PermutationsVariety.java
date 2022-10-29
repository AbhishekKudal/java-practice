package Permutations;

import java.util.ArrayList;

public class PermutationsVoid {
    public static void main(String[] args) {
        permutation("", "abc");

        ArrayList<String> ans = permutationList("", "abc");
        System.out.println(ans);

        System.out.println(permutationCount("", "abcsd"));
    }

    private static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i < p.length() + 1; i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            permutation(first + ch + second, up.substring(1));
        }
    }

    private static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);

        for(int i = 0; i < p.length() + 1; i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            ans.addAll(permutationList(first + ch + second, up.substring(1)));
        }
        return ans;
    }

    private static int permutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);

        int count = 0;

        for(int i = 0; i < p.length() + 1; i++){

            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            count = count + permutationCount(first + ch + second, up.substring(1));
        }
        return count;
    }
}
