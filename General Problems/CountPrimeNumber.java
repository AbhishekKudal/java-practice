//204. Count Primes

//https://leetcode.com/problems/count-primes/

class CountPrimeNumber {
    public int countPrimes(int n) {
        int count = 0;
        if(n == 0 || n == 1 || n == 2){
            return 0;
        }else {
            for(int i = n - 1; i >= 2; i--){
                boolean flag = true;
                for(int j = 2; j <= Math.sqrt(i); j++){
                    if(i % j == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    count++;
                }
            }
            return count;
        }
        
    }
}
