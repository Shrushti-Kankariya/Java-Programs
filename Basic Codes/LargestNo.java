// An algorithm to accept two number and print the largest

import java.util.Scanner;

public class LargestNo{
	public static void main(String[] args){
		int no1;
		int no2;
		Scanner sc = new Scanner(System.in);
		no1 = sc.nextInt();
		no2 = sc.nextInt();

		if (no1 < no2 ){
		
			System.out.println("Largest number is :" + no2);	

		}
		else{
			
			System.out.println("Largest number is :" + no1);
			

		}

	}

}