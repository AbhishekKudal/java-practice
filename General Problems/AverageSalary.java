class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        double sum = 0;
        
        for(int num : salary){
            sum += num;
            min = (num < min)? num : min;
            max = (num > max)? num : max;
        }
        return (sum - min - max)/(salary.length - 2);
    }
}
