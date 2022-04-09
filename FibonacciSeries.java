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
    }
}