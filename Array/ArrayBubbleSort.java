// bubble sorting

import java.util.Scanner;

class ArrayBubbleSort{

	void sort(int []a){
// here the array a is same as the array b. in this method the array i denoted as b
		
		int temp;
		for(int i=0;i<10;i++){
			for(int j=0;j<9-i;j++){		// j<9-i means the next iteration will be upto 9-i time
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

	void print(int [] a){   

		System.out.println("The sorted array is : \n ");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i] + " ");
		}
	}
	
	public static void main(String [] args){
	
		int [] a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 numbers");
		for(int i=0;i<10;i++){
			a[i] = sc.nextInt();
		}

		ArrayBubbleSort a1 = new ArrayBubbleSort();
		a1.sort(a);
		a1.print(a);	
	}	
}