// An algorithm to accept a year and print whether it is leap year or not

import java.util.Scanner;

public class LeapYearOrNot{
	public static void main(String[] args){
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		year = sc.nextInt();

		if (year % 4 == 0 ){
		
		System.out.println("Year is the leap year");	

		}
		else{
			
			System.out.println("Year is not the leap year");
			

		}

	}

}