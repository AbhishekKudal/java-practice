//Sieve of Eratosthenes

//204. Count Primes

//https://leetcode.com/problems/count-primes/

//Brute-force
class CountPrimeNumber1 {
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

//Sieve of Eratosthenes
class SieveOfEratosthenes {
    public int countPrimes(int n) {        
        int count = 0;
        boolean[] primes = new boolean[n + 1];
        
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(! primes[i]){
                for(int j = i*2; j <= n; j += i){
                    primes[j] = true;                    
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(!primes[i]){
                count++;
            }
        }
        return count;
    }
}
