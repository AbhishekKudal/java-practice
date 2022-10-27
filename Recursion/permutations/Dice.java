//Amazon Question

package permutations;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);                            //Printing the output
        System.out.println(diceRet("", 4));     //Returning as an ArrayList and printing the list
    }

    private static void dice(String p, int target) {
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    private static ArrayList<String> diceRet(String p, int target) {
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceRet(p + i, target - i));
        }
        return ans;
    }
}
