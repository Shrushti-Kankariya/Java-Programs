// An algorithm to accept a quantity,rate and print whether customer can get discount or not

import java.util.Scanner;

public class DiscountOrNot{
	public static void main(String[] args){
		int qty;
		int rate;
		Scanner sc = new Scanner(System.in);
		qty = sc.nextInt();
		rate = sc.nextInt();
		double amount = rate * qty;

		System.out.println("The amount you have to pay is :" + amount );
		System.out.println("\n Let's check are you eligible for discount or not");

		if ( qty > 100 ){
		
		System.out.println("you will get discount");	

		}
		else{
			
			System.out.println("\n you will not get discount");
			

		}

	}

}