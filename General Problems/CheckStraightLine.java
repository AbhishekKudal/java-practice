/*
1232. Check If It Is a Straight Line

https://leetcode.com/problems/check-if-it-is-a-straight-line/
*/

class CheckStraightLine {
    public static void main(String[] args){
        int[][] arr = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(arr));
    }
    
    static boolean checkStraightLine(int[][] coordinates) {        
        if(coordinates.length == 2) return true;
        
        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];
        
        for(int i = 1; i < coordinates.length - 1; i++){
            int x = (coordinates[i][0] - coordinates[i+1][0]);
            int y = (coordinates[i][1] - coordinates[i+1][1]);
            
            if(xDiff * y != yDiff * x) return false;                //Collinearity - Check if cross product is different
        }
        return true;
    }
}
