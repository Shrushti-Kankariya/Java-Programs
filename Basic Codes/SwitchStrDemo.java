import java.util.Scanner;

class SwitchStrDemo{
	public static void main(String[] args){
		String taste;
		Scanner sc = new Scanner(System.in);
		System.out.println("What kind of taste you like : ");
		System.out.println("you can see the taste options : ");
		System.out.println("sweet spicy bitter sour ");
		taste = sc.next();

		switch(taste){
			
			case "sweet": System.out.println("You can taste Ice Cream, Ladoo, Cadbury, Jalebi ");
				break;

			case "spicy": System.out.println("You can taste Pav Bhaji, Thecha, Misal Pav");
					break;
				
			case "bitter": System.out.println("You can taste cocoa, coffee, bitter gourd, green tea");
				break;

			case "sour": System.out.println("You can taste tamarind, vinegar, pickles, yogurt");
				break;

			default: System.out.println("Please select valid option.");

		}
	
	}

}