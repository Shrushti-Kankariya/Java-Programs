// write a program to accept two numbers and print welcome is the first number is 3 digit //number and print good bye if the second number is 2 digit number otherwise print hello

import java.util.Scanner;

class TwoNum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int no1 = sc.nextInt();

		System.out.println("Enter the scond number : ");
		int no2 = sc.nextInt();

		if(no1 >= 100 && no1<=999){
			System.out.println("Welcome");
		}
		else if(no2 >= 10 && no2<=99){
			System.out.println("Good bye");
		}
		else{
			System.out.println("Hello");
		}
	}
}