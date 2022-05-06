/*
1779. Find Nearest Point That Has the Same X or Y Coordinate

https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
*/

class LowestManhattenDistance {
    public int nearestValidPoint(int x, int y, int[][] points) {
        boolean valid = false;
        int ans = 0;
        int minDistance = Integer.MAX_VALUE;
        for(int row = 0; row < points.length ; row++){
            if(points[row][0] == x || points[row][1] == y){
                if(Math.abs(points[row][0] - x) + Math.abs(points[row][1] -y) < minDistance){
                    minDistance = Math.abs(points[row][0] - x) + Math.abs(points[row][1] -y);
                    ans = row;
                }
                valid = true;
            }
        }
        if(valid) return ans;
            return -1;
        
        
    }
}
