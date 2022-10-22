/*
Time Complexity - O(nlog(n))
Space Complexity - O(n)
*/

public class SubSequenceUsingRecursion {
    public static void main(String[] args) {
        subSeq("", "abc");
    }

    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }
}
