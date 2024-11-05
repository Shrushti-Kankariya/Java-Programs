// An algorithm to accept a number and print whether it is greater than 10 or not

import java.util.Scanner;

public class GreaterOrNOt{
	public static void main(String[] args){
		int no;
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();

		if (no < 10 ){
		
		System.out.println("Number is not greater than 10");	

		}
		else{
			
			System.out.println("Number is greater than 10");
			

		}

	}

}