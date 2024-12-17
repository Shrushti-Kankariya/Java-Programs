// Exchange sorting

import java.util.Scanner;

class ArrayExchangeSort{

	void sort(int []a){		
		int temp;
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){					
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
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

		ArrayExchangeSort a1 = new ArrayExchangeSort();
		a1.sort(a);
		a1.print(a);	
	}	
}