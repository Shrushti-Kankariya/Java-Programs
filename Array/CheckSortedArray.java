//check if array is sorted in ascending order

import java.util.Arrays;

class CheckSortedArray{
	public static void main(String[] args){
		int [] arr = {3,5,7,2,8,1};
		System.out.print("Array : " + Arrays.toString(arr));
		System.out.println("\nIs array sorted : " + isSorted(arr));
	}

	public static boolean isSorted(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i] < arr[i+1])
				return false;
		}
		return true;
	}
}