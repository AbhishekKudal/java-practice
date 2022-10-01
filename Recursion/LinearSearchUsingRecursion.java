import java.util.ArrayList;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,9,10,15};
        int target = 2;
        System.out.println(find(arr, target, 0));       //Boolean
        System.out.println(findIndex(arr, target, 0));  //Index from first
      
        //Finding Index from the last to first (start searching from last) 
        System.out.println(findIndexFromLast(arr, target, arr.length - 1));
        
        //Find all recurrances
        findAll(arr, target, 0);
        System.out.println(list);
        
        //Find all recurrances while returning the ArrayList
        System.out.println(findAllUsingArrayList(arr, target, 0, listNew));
    }

    //returning boolean
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    //returning integer
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr, target, index + 1);
        }
    }

    //Finding Index from the last to first (start searching from last)
    static int findIndexFromLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return findIndexFromLast(arr, target, index - 1);
        }
    } 

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAll(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
            
        findAll(arr, target, index + 1);

    }

    static ArrayList<Integer> listNew = new ArrayList<>();
    static ArrayList<Integer> findAllUsingArrayList(int[] arr, int target, int index, ArrayList<Integer> listNew){
        if(index == arr.length){
            return listNew;
        }

        if(arr[index] == target){
            listNew.add(index);
        }
        return findAllUsingArrayList(arr, target, index + 1, listNew);
    } 
}
