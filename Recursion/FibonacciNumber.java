/*
509. Fibonacci Number

https://leetcode.com/problems/fibonacci-number/
*/

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(10));               //Classic recursion
        System.out.println(fiboFormula(10));        //Using complete formula
        System.out.println(fiboShortFormula(10));   //Using short formula
    }

    static int fibo(int n){
        if(n < 2) return n;
        return fibo(n-1) + fibo(n-2);
    }

    static double fiboFormula(int n){
        return (1 / Math.sqrt(5)) * (Math.pow(((1 + Math.sqrt(5))/2),n) - Math.pow(((1 - Math.sqrt(5))/2),n));
    }

    static double fiboShortFormula(int n){
        return (Math.pow(((1 + Math.sqrt(5))/2),n)) / Math.sqrt(5);

    }
}
