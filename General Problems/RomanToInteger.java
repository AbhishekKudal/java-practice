/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
*/

class RomanToInteger1 {
    public int romanToInt(String s) {
        int result = 0;
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i] = 1;
            }else if(s.charAt(i)=='V'){
                arr[i] = 5;
            }else if(s.charAt(i)=='X'){
                arr[i] = 10;
            }else if(s.charAt(i)=='L'){
                arr[i] = 50;
            }else if(s.charAt(i)=='C'){
                arr[i] = 100;
            }else if(s.charAt(i)=='D'){
                arr[i] = 500;
            }else if(s.charAt(i)=='M'){
                arr[i] = 1000;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(i != arr.length-1 && arr[i]<arr[i+1]){
                result = result + arr[i+1] - arr[i];
                i++;
            }else{
                result = result + arr[i];
            }
        }
        return result;
    }
}


//Using switch case //much faster that if-else-if
class RomanToInteger2 {
    public int romanToInt(String s) {
        int result = 0;
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = value(s.charAt(i));
        }
        
        for(int i=0;i<arr.length;i++){
            if(i != arr.length-1 && arr[i]<arr[i+1]){
                result = result + arr[i+1] - arr[i];
                i++;
            }else{
                result = result + arr[i];
            }
        }
        return result;
    }
    
    static int value(char a){
        int number = 0;
        switch (a){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
