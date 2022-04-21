/* 
There are N empty glasseswith a capacity of 1,2,...,N litres (there is exactly one glass of each unique capacity).
You want to pour exactly K litres of water into glasses. Each glass may be either full or empty (A glass cannot be partially filled).
What is the minimum number of glasses that you need to contain K litres of water?

Write a function that given two integers N and K, returns the minimum number of glasses that are needed to contain exactly K litres of water.
If it is not possible to pour exactly K litres of water into glasses then the function should return -1
*/

public class GlassCounter {
    public static void main(String args[]) {
        System.out.println(solution(15, 30));
    }

    static int solution(int n, int k) {
        int count = 0;
        long capacity = n * (n + 1) / 2;
        if (capacity < k) {
            return -1;
        } else if (k == n) {
            return 1;
        } else {
            for (int i = n; i > 0; i--) {
                if (k > 0) {
                    if ((k - i) >= 0) {
                        k = k - i;
                        count++;
                    }
                } else {
                    break;
                }
            }
            return count;
        }
    }
}
