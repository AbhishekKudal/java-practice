// Check if every element in a given array is Palindrome or not.

public class palindromicArrays {
    public static void main(String[] args) {
        int a[] = {111,121,222,333,454}
            
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int modifiedNumber = 0;
            int r = 0;
            int currentNumber = a[i];

            while (currentNumber > 0) {
                r = currentNumber % 10;
                modifiedNumber = (modifiedNumber * 10) + r;
                currentNumber = currentNumber / 10;
            }

            if (a[i] != modifiedNumber)
                System.out.println("Not a palindromic array");
        }
        System.out.println("Palindromic Array");
    }
}
