public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(check(15223));
    }

    static String check(int num){
        num = num & 1;
        if(num == 1){
            return "Odd";
        }else{
            return "Even";
        }
    }
}
