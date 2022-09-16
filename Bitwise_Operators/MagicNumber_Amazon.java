public class MagicNumber_Amazon {
    public static void main(String[] args) {
        int n = 4;
        int ans = magicNumber(n);
        System.out.println(ans);
    }

    static int magicNumber(int n){
        int sum = 0;
        int base = 5;
        while(n > 0){
            int temp = n & 1;
            n = n >> 1;
            sum = sum + temp * base;
            base = base * 5;
        }
        return sum;
    }
}
