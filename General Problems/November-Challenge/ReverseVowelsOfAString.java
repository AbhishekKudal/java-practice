/*
345. Reverse Vowels of a String

https://leetcode.com/problems/reverse-vowels-of-a-string
*/

class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] arr = s.toCharArray();

        boolean st = false;
        boolean e = false;

        while(start < end){
            if(isVowel(arr[start])){
                st = true;
            }else{
                start++;
            }

            if(isVowel(arr[end])){
                e = true;
            }else{
                end--;
            }
            
            if(st && e){
                swap(arr, start, end);
                st = false;
                e = false;
                start++;
                end--;
            }

            
        }

        String str = String.valueOf(arr);

        return str;
    }

    public static void swap(char[] arr, int first, int second){
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }

        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}
