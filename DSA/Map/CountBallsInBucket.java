package DSA.Map;

import java.util.*;

public class CountBallsInBucket{
    public static void main(String[] args) {
        List<String> balls = new ArrayList<String>(Arrays.asList("red", "green", "yellow", "red", "red"));

        //create a map
        Map<String, Integer> map = new HashMap<>();

        for (String ball : balls) {
            if(map.containsKey(ball)){
                map.put(ball, map.get(ball) + 1);
            }else{
                map.put(ball, 1);
            }
        }

        //print out the colors
        System.out.println(map);
    }
}