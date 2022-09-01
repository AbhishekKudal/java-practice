/*
1491. Average Salary Excluding the Minimum and Maximum Salary

https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

*/

class MinimumAndMaximumSalary {
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
