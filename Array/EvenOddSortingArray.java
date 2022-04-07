public class EvenOddArray {
    public static void main(String args[]) {
      int arr[] = {1,2,3,4,5};
      int modifiedArr[] = new int[arr.length];
      int j = 0;
      int k = arr.length-1;
      
      for(int i=0; i<arr.length;i++){
          if(arr[i]%2 == 0){
              modifiedArr[j] = arr[i];
              j++;
          }else{
              modifiedArr[k] = arr[i];
              k--;
          }
      }
        System.out.print("Modified Array = ");
      for(int a : modifiedArr){
       System.out.print(a + " ");   
      }
    }
}