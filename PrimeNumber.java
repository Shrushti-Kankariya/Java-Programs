// prime number is a number which is divisible by 1 and itself

import java.util.Scanner;

class PrimeNumber{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		Boolean flag = false;
		System.out.println("Enter any number :");
		int no = sc.nextInt();


		/* 
		for(int i=2; i<no ; i++){
			if(no%i==0){
				flag = true;
				break;
			}	
		}
		*/

	// This is time efficient than above one 

		for(int i=2; i<Math.sqrt(no) ; i++){
			if(no%i==0){
				flag = true;
				break;
			}	
		}



		if(flag == true){
			System.out.println("The number is not a prime number.");
		}
		else{
			System.out.println("The number is a prime number.");
		}
	}
}

