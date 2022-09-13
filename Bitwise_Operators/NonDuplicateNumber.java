/*
 * You have given an array consisting of exactly once duplicated numbers and one non-duplicate
 * Find the non-duplicate number
*/

public class NonDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {5,8,-2,6,4,5,1,8,-2,1,6};

        int ans = 0;

        for(int num : nums){
            ans = ans ^ num;
        }
        System.out.println(ans);
    }
}
