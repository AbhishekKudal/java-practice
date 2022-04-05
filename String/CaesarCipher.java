import java.util.*;

public class CeaserCipher {
    public static void main(String[] args) {
        CeaserCipher h = new CeaserCipher();
        System.out.println("Original String: FREE CAKE IN THE CONFERENCE ROOM");
        h.encrypt("FREE CAKE IN THE CONFERENCE ROOM",17);
        
    }
    public void encrypt(String input, int key){
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = "";
        shiftedAlphabet = alphabet.substring(key) +alphabet.substring(0,key);
         //System.out.println(shiftedAlphabet.toString()+" ");
        
        for(int i=0; i<encrypted.length();i++){
            char currChar = encrypted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            if(idx!=-1){
                char newChar = shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i,newChar);
            }
        }
        System.out.println("Encrypted String: "+encrypted.toString());
    }
}