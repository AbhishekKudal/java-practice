import java.util.Arrays;

/*AKA In place sorting; Sinking sort; Exchange sort

Time complexity = 
O(n^2)  -> Worst case
O(n)    --> Best case

Space complexity    --> O(1)    ->Constant
*/


public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {10,5,4,6,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        boolean swapped = false;

        //run the steps n-1 times i.e. passes
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            //for each step, max element will come at the last respective index
            for(int j = 1; j < arr.length - i; j++){
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular ith pass, it means array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}
