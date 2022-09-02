import java.util.*; 
public class BinarySearch {
    public static void main(String args[]) {
      char charArr[] = {'b','c','a','d','e'};
      byte byteArr[] = {10,20,127,22,50,45};
      short shortArr[] = {500,800,100,32767,32456};
      int intArr[] = {1542,25874,1456,9872,4512};
      long longArr[] = {254577878,12457865,12457865,12457956};
      float floatArr[] = {1245.26f,653.25f,4515.2358f,874.12f};
      double doubleArr[] = {45781.326565,4578451.245,12475.2356};
      
	  //Array should be sorted before binarySearch else results would be direct indexes as is.
      Arrays.sort(charArr);
      Arrays.sort(byteArr);
      Arrays.sort(shortArr);
      Arrays.sort(intArr);
      Arrays.sort(longArr);
      Arrays.sort(floatArr);
      Arrays.sort(doubleArr);
      
      int charIndex  = Arrays.binarySearch(charArr,'d');                //Not present
      int byteIndex  = Arrays.binarySearch(byteArr, (byte)22);          //Present
      int shortIndex = Arrays.binarySearch(shortArr, (short)540);       //Not present
      int intIndex   = Arrays.binarySearch(intArr, 25874);              //Present
      int longIndex  = Arrays.binarySearch(longArr,5487545);            //Not Present
      int floatIndex = Arrays.binarySearch(floatArr,425.556f);          //Not present
      int doubleIndex= Arrays.binarySearch(doubleArr, 45785.2356);      //Not present   
      
      System.out.print(charIndex+ " " +byteIndex+ " " +shortIndex+" "+intIndex+" "+longIndex+" "+floatIndex+" "+doubleIndex);
    }
}
