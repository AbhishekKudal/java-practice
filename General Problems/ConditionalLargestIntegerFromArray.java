/* Write a function solution such that , given an array A of N integers, returns the largest integer K>0 such that both values K and -K exist in array A. If there is no such integer, the function should return 0.

Sample: Given A = [3,2,-2,5,-3,-5], the function should return 3 as both 3 and -3 exists in array A.    */

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int[] arrToTest = {3,2,-2,5,-3,-5};
        int result = HelloWorld.solution(arrToTest);
        System.out.println(result);
    }

    static int solution(int[] arr) {
        int result = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == -(arr[j])) {
                    return -(arr[i]);
                }
            }
        }
        return result;
    }
}