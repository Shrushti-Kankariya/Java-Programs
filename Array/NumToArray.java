// convert number to array
// i/p = no =23456
// o/p = [2,3,4,5,6]

import java.util.Scanner;
import java.util.Arrays;
class NumToArray{

	void convertToArray(int no){
		int digits = 0;
		int temp = no;
		int d;
		// we are finding the length of the number 
		while(no>0){
			d = no % 10;
			digits++;
			no = no / 10;
			
		}
		System.out.println("Total digits = " + digits);
	
		no = temp;
		int [] a = new int[digits];
		while(no>0){
			d = no%10;
			a[digits-1] = d;
			no = no / 10;
			digits--;
		}
		/*for(int i=0;a.length;i++){
			System.out.print(a[i]);
		}
*/
		System.out.println(Arrays.toString(a));  //builtin function to store in array
		
	}

	public static void main(String [] args){
	
		//int [] a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numbers");
		int no = sc.nextInt();

		NumToArray a1 = new NumToArray();
		a1.convertToArray(no);	
	}	
}