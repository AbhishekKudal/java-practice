//Count the number of Zeroes in a given number

public class CountZeroes {
    public static void main(String args[]) {
        int ans = count(100230, 0);
        System.out.println("Total Zeroes = " + ans);
    }
    
    static int count(int n, int count){
        if(n == 0){
            return count;
        }
        
        if(n % 10 == 0){
            return count(n/10, count+1);
        }
        
        return count(n/10, count);
    }
}
