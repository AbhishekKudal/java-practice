// 2119. A Number After a Double Reversal

//https://leetcode.com/problems/a-number-after-a-double-reversal/

class DoubleReverse {
    public boolean isSameAfterReversals(int num) {
        return reverse(num);
    }
    
    public boolean reverse(int n){
        if(n % 10 == 0 && n != 0){
            return false;
        }else{
            return true;
        }
    }
}
