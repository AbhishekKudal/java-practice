/*
202. Happy Number

https://leetcode.com/problems/happy-number/
*/

class HappyNumber {
    public boolean isHappy(int n) {
        if (n==1)
            return true;
        if(n<=4)
            return false;
        int num=0;
            while (n>0){
                num+= Math.pow(n%10,2);
                n /=10;
            }
            if (num != 1)
                return isHappy(num);
         return true;
    }
}

/*
Approach: 

Using Two Pointers; Fast and Slow (Linked List Cycle Logic)
Complexity

    Time complexity: O(n)

    Space complexity: O(1)

*/
class HappyNumber1 {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = square(slow);
            fast = square(square(fast));
        }while (slow != fast);

        if(slow == 1){
            return true;
        }

        return false;
    }

    public int square(int n){
        int ans = 0;

        while(n > 0){
            int rem = n % 10;
            ans = ans + rem*rem;
            n = n/10;
        }

        return ans;
    }
}
