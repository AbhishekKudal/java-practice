public class FindTheIthBit {
    public static void main(String[] args) {
        System.out.println(iThBit(10, 2));
    }

    static String iThBit(int num, int n){
        return Integer.toBinaryString(num & 1 << n-1);
    }
}
