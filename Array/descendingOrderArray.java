public class descendingOrderArray {
    public static void main(String[] args) {
        int[] arr = {5,8,9,3,45,25,41};
        int count = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length-i; j++){
                count++;
                int temp = 0;
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }           
            }
        }
        for(int i =0; i<arr.length ; i++)
        System.out.print(arr[i]+" ");
        System.out.println("Loop ran for " +count+ " times");
    }
}
