/*
1502. Can Make Arithmetic Progression From Sequence

https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/submissions/
*/

import java.util.*;

class CanMakeArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = 0;
        for(int i = 0; i < arr.length - 1; i++){
            diff = arr[i+1] - arr[i];
            if(i < arr.length - 2 && arr[i+2] - arr[i+1] != diff){
                return false;
            }
        }
        return true;   
    }
}
