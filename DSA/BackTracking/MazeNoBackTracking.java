package BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(pathCount(3, 3));              //Simple Path Count
        path("", 3, 3);                                  //Paths as Strings
        System.out.println(pathsAsAList("", 3, 3));      //Paths As ArrayList
        pathDigonal("", 3, 3);                           //Paths including digonals

        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        pathWithObstacles("", board, 0,0);              //Paths with obstacles
    }

    private static int pathCount(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = pathCount(r-1, c);
        int right = pathCount(r, c-1);

        return left + right;
    }

    private static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p + "D", r-1, c);
        }

        if(c > 1){
            path(p + "R", r, c-1);
        }
    }

    private static ArrayList<String> pathsAsAList(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> local = new ArrayList<>();
        if(r > 1){
            local.addAll((pathsAsAList(p + "D", r-1, c)));
        }

        if(c > 1){
            local.addAll(pathsAsAList(p + "R", r, c-1));
        }

        return local;
    }

    private static void pathDigonal(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            pathDigonal(p + "V", r-1, c);      //Vertical
        }

        if(r > 1 && c > 1){
            pathDigonal(p + "D", r-1, c-1);      //Digonal
        }

        if(c > 1){
            pathDigonal(p + "H", r, c-1);      //Horizontal
        }
    }

    private static void pathWithObstacles(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
        }

        if(maze[r][c] == false){
            return;
        }

        if(r < maze.length - 1){
            pathWithObstacles(p + "D", maze, r+1, c);
        }

        if(c < maze[0].length - 1){
            pathWithObstacles(p + "R", maze, r, c+1);
        }
    }
}
