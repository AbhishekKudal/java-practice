/* Write a function solution that, given two integers N and K, returns a palindrome of length N which consists of K distinct lower-case letters(a-z)*/

import java.util.Random;

public class Palindrome {
    public static void main(String[] args) {
        int n = 20; //length
        int k = 10; //Distinct characters
        char[] randChar = generateCharacters(n);
        String result = Palindrome.solution(randChar, n, k);
        System.out.print(result);
    }

    public static char[] generateCharacters(int k) {
        Random r = new Random();
        char[] randomCharacters = new char[k];
        for (int i = 0; i < k; i++) {
            randomCharacters[i] = (char)(i + 'a'); //non-repetitive

            //for random characters (can be repetitive)
            //randomCharacters[i] = (char)(r.nextInt(26)+'a');
        }
        return randomCharacters;
    }

    public static String solution(char[] arr, double length, int k) {
        char result[] = new char[(int) length];
        String finalResult = "";
        int j = 0;
        for (int i = 0; i < (int) Math.ceil(length / 2); i++) {
            result[i] = arr[j];
            result[(int) length - i - 1] = arr[j];
            if (j < (k - 1)) j++;
        }
        for (char a: result) {
            finalResult = finalResult + a;
        }
        return finalResult;
    }
}
