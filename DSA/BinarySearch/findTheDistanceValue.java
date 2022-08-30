//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
//Pending
// 1385. Find the Distance Value Between Two Arrays

import java.util.Arrays;

public class minimumDistance {

	public static void main(String[] args) {
		// TO DO Auto-generated method stub
		//int arr1 = [4,5,8], int arr2 = [10,9,1,8], d = 2
		int arr1[] = {4,5,8};
		int arr2[] = {10,9,1,8};
		int d =2;
		
		System.out.println(findTheDistanceValue(arr1,arr2,d));
	}
	

	public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		Arrays.sort(arr2); //[1,8,9,10]
		int ans = 0;
		for(int num : arr1){
			int start = 0;
			int end = arr2.length-1;
			while(start<=end){
				int mid = start+(end-start)/2;
				if(num<arr2[mid]){
						end = mid-1;
				}
				else if(num>arr2[mid]){
					start = mid+1;
				}
				else{
					break;
				}
				if(Math.abs(arr2[start] - num) >d && (Math.abs(arr2[start+1] - num) >d ) ){
					ans += 1;
				}
			}
		}
		return ans;
	}
	

}
