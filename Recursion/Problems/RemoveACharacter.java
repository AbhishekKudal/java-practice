public class RemoveACharacter {
    public static void main(String[] args) {
        //skipNoReturn("", "nalla");
        System.out.println(skipWithReturn("nalla-revan"));
    }

    static void skipNoReturn(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skipNoReturn(p, up.substring(1));
        }else{
            skipNoReturn(p + ch, up.substring(1));
        }
    }

    static String skipWithReturn(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skipWithReturn(up.substring(1));
        }else{
            return ch + skipWithReturn(up.substring(1));
        }
    }
}
