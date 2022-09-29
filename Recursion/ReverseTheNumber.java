public class ReverseTheNumber {
    
    static int sum = 0;
    static void rev1(int n){
        if (n == 0){
            return;
        }
        sum = sum * 10 + n%10;
        rev1(n/10);
    }
    
    public static void main(String args[]) {
      int n = 3256;
      rev1(n);
      System.out.println(sum);
    }
}
