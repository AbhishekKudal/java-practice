/*
509. Fibonacci Number

https://leetcode.com/problems/fibonacci-number/
*/

class FibonacciNumber {
    public int fib(int n) {
        if(n < 2)return n;
        return fib(n-1) + fib(n-2);
    }
}
