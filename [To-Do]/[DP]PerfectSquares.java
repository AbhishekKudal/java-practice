/*
279. Perfect Squares

https://leetcode.com/problems/perfect-squares/description/
*/

//----------------------Approach #1: Brute Force (Recursion) - TLE---------------------------

public int numSquares(int n) {
	if (n < 4)
		return n;
	
	int ans = n;
	
	for (int i = 1; i * i <= n; i++) {
		int square = i * i;
		ans = Math.min(ans, 1 + numSquares(n - square));
	}
	
	return ans;
}


//----------------------Approach #2: Top Down DP (Recursion + Memoization)-----------------------

// Time complexity: O(N * sqrt(N))
// Space complexity: O(N)
	
class Solution {
    public int numSquares(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }
    
    public int helper(int n, int[] memo) {
        if (n < 4)
            return n;
        
        if (memo[n] != 0)
            return memo[n];
        
        int ans = n;
        
        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            ans = Math.min(ans, 1 + helper(n - square, memo));
        }
        
        return memo[n] = ans;
    }
}

//-------------------------------Approach #3: Bottom UP DP (Using DP Array)-------------------------

// Time complexity: O(N * sqrt(N))
// Space complexity: O(N)

public int numSquares(int n) {
	int[] dp = new int[n + 1];
	dp[0] = 0;
	
	for (int i = 1; i <= n; i++) {
		dp[i] = i;
		
		for (int j = 1; j * j <= i; j++) {
			int square = j * j;
			dp[i] = Math.min(dp[i], 1 + dp[i - square]);
		}
	}
	
	return dp[n];
}


/*
Approach #4: Legendre's 3-Square Theorem

    4-Square theorem: Every natural no is sum of 4 squares.
    3-Square Theorem: Every natural no is sum of 3 squares if it does not satisfies 4^a (8b + 7) = N
    So our answer will be 1, 2, 3 or 4.

Steps:

    If it's perfect square, return 1
    If it satisfies 4^a (8b + 7), return 4
    If it's sum of 2 perfect squares, return 2
    Otherwise, return 3

*/
// Time complexity: O(sqrt(N))
// Space complexity: O(1)
	
public int numSquares(int n) {
	int sqrt = (int) Math.sqrt(n);

	if (sqrt * sqrt == n) // Perfect square
		return 1;

	while (n % 4 == 0) // 4^a (8b + 7)
		n = n / 4;

	if (n % 8 == 7)
		return 4;

	for (int i = 1; i * i <= n; i++) { // Sum of two perfect squares
		int square = i * i;
		int base = (int) Math.sqrt(n - square);

		if (base * base == n - square)
			return 2;
	}

	return 3;
}
