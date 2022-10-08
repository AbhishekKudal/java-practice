import java.util.Arrays;

public class SelectionSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2,5,6,4,3,1};
        sort(arr ,arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int row, int col, int maxIndex){
        if(row == 0)return;

        if(row > col){
            if(arr[col] > arr[maxIndex]){
                sort(arr, row, col + 1, col);
            }else{
                sort(arr, row, col + 1, maxIndex);
            }
        }else{
            swap(arr, row - 1, maxIndex);
            sort(arr, row - 1, 0, 0);
        } 
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
