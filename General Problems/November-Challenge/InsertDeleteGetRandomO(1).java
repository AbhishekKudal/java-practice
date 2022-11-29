/*
380. Insert Delete GetRandom O(1)

https://leetcode.com/problems/insert-delete-getrandom-o1/description/
*/

class RandomizedSet {
    HashSet <Integer> randomSet;

    public RandomizedSet() {
        randomSet = new HashSet<>();
    }
    
    public boolean insert(int val) {
        return randomSet.add(val);
    }
    
    public boolean remove(int val) {
        return randomSet.remove(val);
    }
    
    public int getRandom() { 
        Integer[] numbers = randomSet.toArray(new Integer[randomSet.size()]);
        Random random = new Random();
        int randomNumber = random.nextInt(randomSet.size());
        return numbers[randomNumber];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
