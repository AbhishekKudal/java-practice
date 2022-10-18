/*
1051. Height Checker

https://leetcode.com/problems/height-checker/
*/

class HeightChecker {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] expected = heights.clone();
        Arrays.sort(expected);

        for(int i = 0; i < expected.length; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}
