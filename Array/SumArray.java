// sum of elements in an array
import java.util.Arrays;

class SumArray{
	public static void main(String[] args){
		int [] arr = {1,2,3,4,5};
		System.out.print("Array : " + Arrays.toString(arr));
		System.out.println("\nSum of array elements : "+ sum(arr));
	}

	public static int sum(int[] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		return sum;
	}
}