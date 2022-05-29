/*
Count the total roatation and return the lowest right or left side rotation for a space seperated String
Left side rotation would be negative and right side rotation would be positive.

Example: 
1. Input: "abc cab"
    Output: 1
2. Input: "rotate tatero"   
    Output: -2
*/

public class StringRotation {
    public static void main(String args[]) {
      int rotation = StringRotation.countRotation("abc cab");
      System.out.println(rotation);
    }
    static int countRotation(String input){
        String s1 = input.split(" ")[0];
        String s2 = input.split(" ")[1];
        
        if(s1.equals(s2) || s1.length()!=s2.length()){
            return -1;
        }else{
            int l = (s1 + s1).indexOf(s2);
            int r = (s2 + s2).indexOf(s1);
            if(l<r){
                return -l;      //Negative value as it would be left side rotation
            }else{
                return r;
            }
        }
    }
}
