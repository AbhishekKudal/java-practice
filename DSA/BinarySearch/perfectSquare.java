/* * https://leetcode.com/problems/valid-perfect-square/
 * 367. Valid Perfect Square

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

Example 1:

Input: num = 16
Output: true

Example 2:

Input: num = 14
Output: false

 */
public class perfectSquare {
    
    public static void main(String[] args) {
        int num = 808201;   //2147395600, 972196

        System.out.println(isPerfectSquare(num));
    }


    static boolean isPerfectSquare(int num) {        
        int start = 1;
        int end = num;
        
        while(start <= end){
            long mid = start + (end - start)/2;
            
            if(mid*mid == num){
                return true;
            }
            
            if(mid*mid > num){
                end = (int)mid - 1;
            }else{
                start = (int)mid + 1;
            }
        }
        return false;
    }
}
