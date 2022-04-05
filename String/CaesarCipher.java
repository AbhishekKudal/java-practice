import java.util.*;

public class Main {
    public static void main(String[] args) {
        CeaserCipher C1 = new CeaserCipher();
        C1.encrypt("Free Cake in the conference room",17);
    }
}    

class CeaserCipher{
    
    public CeaserCipher(){
        System.out.println("Original String: Free Cake in the conference room");
    }
    
    String alphabetUC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alphabetLC = alphabetUC.toLowerCase();     //"abcdefghijklmnopqrstuvwxyz"
    
    public void encrypt(String input, int key){
        StringBuilder encrypted = new StringBuilder(input);

        String shiftedAlphabetUC = alphabetUC.substring(key) +alphabetUC.substring(0,key);
        String shiftedAlphabetLC = alphabetLC.substring(key) +alphabetLC.substring(0,key);
            for(int i=0; i<encrypted.length();i++){
                char currChar = encrypted.charAt(i);
                int idxUC = alphabetUC.indexOf(currChar);
                int idxLC = alphabetLC.indexOf(currChar);
                
                if(idxUC!=-1){
                    char newChar = shiftedAlphabetUC.charAt(idxUC);
                    encrypted.setCharAt(i,newChar);
                }else if(idxLC!=-1){
                    char newChar = shiftedAlphabetLC.charAt(idxLC);
                    encrypted.setCharAt(i,newChar);
                }
            }
        System.out.println("Encrypted String: "+encrypted.toString());
    }
}
