// accept the number from user and print ii's even or odd using method

import java.util.Scanner;

class EvenOdd{
	
	
	void acceptNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any number : ");
		int no = sc.nextInt();

		EvenOdd(no);
	}

	void EvenOdd(int num){
		if(num%2 == 0)
			System.out.println("It's even!!");
		else 
			System.out.println("It's odd!!");
	}
	
	public static void main(String [] args){
		EvenOdd e1 = new EvenOdd();
		e1.acceptNumber();

	}
}