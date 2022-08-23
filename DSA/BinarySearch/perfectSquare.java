public class perfectSquare {
    
    public static void main(String[] args) {
        int num = 808201;   //2147395600, 972196

        System.out.println(isPerfectSquare(num));
    }


    static boolean isPerfectSquare(int num) {        
        int start = 1;
        int end = num;
        
        while(start <= end){
            long mid = start + (end - start)/2;
            
            if(mid*mid == num){
                return true;
            }
            
            if(mid*mid > num){
                end = (int)mid - 1;
            }else{
                start = (int)mid + 1;
            }
        }
        return false;
    }
}
