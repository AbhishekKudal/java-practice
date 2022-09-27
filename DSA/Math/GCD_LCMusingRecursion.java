public class GCD_LCMusingRecursion {
    public static void main(String args[]) {
      
      //GCD / HCF
      System.out.println(gcd(8,16));
      
      //LCM1
      System.out.println(lcm1(8,16));
      
      //LCM2
      System.out.println(lcm2(8,16));
    }
    
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a , a);
    }
    
    static int lcm1(int a, int b){
        return a * b / gcd(a,b);
    }
    
    static int lcm2(int a, int b){
        int d,f,g;
        
        d = gcd(a,b);
        f = a / d;
        g = b / d;
        
        return f * g * d;
    }
}
