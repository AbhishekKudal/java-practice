//Merge Sort Using copy of Array

//912. Sort an Array

//https://leetcode.com/problems/sort-an-array/

/*
Complexity - 
    * Time = O(nlog(n))
    * Space = O(n)
* Merge sort is preferred in case of linked list as linked list does not have continuous memory allocation which is the case for Arrays  
*/

import java.util.Arrays;

class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        
        int mid = nums.length / 2;
        
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(nums, mid, nums.length));
        
        return merge(left, right);
    }
    
    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            
            k++;
        }
        
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        
        return mix;
    }
}
