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

//With precision
public class SquareRootWithPrecision {
    public static void main(String args[]) {
        int number = 40;
        int precision = 3;
        System.out.printf("%3f",sqrt(number, precision));
    }
    
    static double sqrt(int n, int p){
        int start = 0;
        int end = n;
        double root = 0.0;
        int mid = 0;
        
        while(start <= end){
            mid = start + (end - start)/2;
            
            if(mid * mid == n){
                return mid;
            }
            
            if(mid * mid > n){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        System.out.println(end);
        root = end;
        double incr = 0.1;
        for(int i = 0; i < p; i++){
            while(root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
