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
