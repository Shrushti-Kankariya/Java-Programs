// write a java program to accept 10 number and store them in array and print only 3 digits number from array.

import java.util.Scanner;

class ThreeDig{

	public static boolean digit(int no){
		
		if(no>99 && no<999){
			return true;
		}
		else{
			return false;
		}
		
	}

	public static void main(String[] args){
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++){
			a[i] = sc.nextInt();
		} 
		for(int i=0;i<10;i++){
			if(digit(a[i]))
				System.out.println(a[i]);
		}
	}
}