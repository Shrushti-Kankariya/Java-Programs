// Find the maximum and minimum in an array

class MinMaxArray{
	public static void main(String[] args){
		int [] arr = {3,5,7,2,8};
		int [] result = findMinMax(arr);

		System.out.println("Minimum : "+ result[0]+",Maximum : "+result[1]);
	}

	public static int[] findMinMax(int[] arr){
		int min = arr[0];
		int max = arr[0];
	
		for(int num : arr){
			if(num<min)
				min = num;
			if(num>max)
				max = num;
		}
		return new int[]{min,max};
	}
}