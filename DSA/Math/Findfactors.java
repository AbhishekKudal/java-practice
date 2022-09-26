import java.util.*;

public class Findfactors {
    public static void main(String args[]) {
        factors1(40);
            System.out.println();
        factors2(20);
    }
    
    // Time Complexity --> O(n)
    // Space Complexity -> Constant O(1)
    static void factors1(int n) {
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i+ " ");
            }
        }
    }
    
    // Both Time and Space complexity --> O(Sqrt(n))
    static void factors2(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.print(i+ " ");
                list.add(n / i);
            }
        }
        
        for(int j = list.size() - 1; j >= 0; j--){
            System.out.print(list.get(j) + " ");
        }
    }
}
