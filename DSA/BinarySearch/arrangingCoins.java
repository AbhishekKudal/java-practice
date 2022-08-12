public class arrangingCoins {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(arrangeCoins(n));
    }
    static int arrangeCoins(int givenSum) {
        long start = 1;
        long end = givenSum;
        long mid,temp;
        
        while(start <= end){
            mid = start + (end-start)/2;
            temp = mid*(mid+1)/2;
            
            if(temp == givenSum){
                return (int)mid;
            }

            if(temp > givenSum){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return (int)end;
    }
}
