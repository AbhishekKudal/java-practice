//Problem with Solution - https://stackoverflow.com/questions/62981446/finding-the-minimum-number-which-when-added-to-running-sum-of-array-is-1

import java.util.Arrays;
import java.util.List;
public class Main
{
	public static void main(String[] args) {

        List<Integer> arr=Arrays.asList(1,-2,3,4,5,-6,-7);
        // List<Integer> arr=Arrays.asList(-2, 3, 1, -5, 999);

	 int recordMin = 0;
	 int sum = 0;
		  for(int elm:arr){
		    sum += elm;
		    recordMin = Math.min(recordMin, sum);
		  }




// 		List arr = new ArrayList<Int>(-5, 6, 7, -8, -9)
// 		int x= 1;
// 		if(arr.get(0)+x < 1){
// 		    x = arr.get(0)*-1;
// 		    x += 1;
// 		    System.out.println("start x = " + x);

// 		}
// 		int index = 0;
// 		int sum = x;
// 		while(true){
//     		while(sum>0 && index < arr.size() ){
//     		    sum = sum + arr.get(index++);
//     		    System.out.println("sum" + sum + "  index = " + index);
//     		}
//     		if(index != arr.size() || sum <= 0){
//     		    x += 1;
//     		    index = 0;
//     		    System.out.println("Mid x = " + x);
//     		    sum = x;

//     		} else {
//     		    break;
//     		}
// 		}
		System.out.println("Final x = "+ (-recordMin + 1));

		}
}
