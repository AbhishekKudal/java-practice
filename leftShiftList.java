import java.util.ArrayList;

//Shift the elements in the list to its left by given value 'd'

public class leftShiftList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int d = 2;

        while(d>0){
            Integer temp = 0;
            temp = arr.remove(0);
            arr.add(temp);
            d--;
        }
        System.out.println(arr);
    }
}