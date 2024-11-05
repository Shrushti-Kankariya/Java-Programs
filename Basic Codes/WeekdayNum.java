// The weekday number to calculate the weekday name

import java.util.Scanner;

class WeekdayNum{
	public static void main(String[] args){
		int day;
		Scanner sc = new Scanner(System.in);
		day = sc.nextInt();

		switch(day){

			case 1:
				System.out.println("Monday");
				break;

			case 2:
				System.out.println("Tuesday");
				break;
			
			case 3:
				System.out.println("Wednesday");
				break;

			case 4:
				System.out.println("Thruday");
				break;

			case 5:
				System.out.println("Friday");
				break;

			case 6:
				System.out.println("Saturday");
				break;

			case 7:
				System.out.println("Sunday");
				break;
		}

	}
}