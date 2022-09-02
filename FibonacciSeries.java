public class FibonacciSeries {
    public static void main(String args[]) {
      int firstTerm = 0;
      int secondTerm = 1;
      int n = 15;
      int answer = 0;
          System.out.println("Fibonacci Series till " + n + " terms:");
      for(int i=0;i<n;i++){
         answer = firstTerm + secondTerm;
         System.out.print(answer+", ");
         secondTerm = firstTerm;
         firstTerm = answer;
      }
        int ans = fibo(7);
         System.out.println(ans);
    }
    
    // another better approach
    public static fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}


    
