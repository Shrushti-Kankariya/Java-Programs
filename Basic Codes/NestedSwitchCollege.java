//Java Program to demonstrate the use of Java Nested Switch for the subject in college in every year including branch.

import java.util.Scanner;

class NestedSwitchCollege{

	public static void main(String[] args){
		char branch;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the branch and enter the first letter : \n"+" C= CSE E= ECE M= Mechanical");
		branch = sc.next().charAt(0);

		System.out.println("Enter your college year :");
		year = sc.nextInt();

		switch(year){

			case 1:
				System.out.println("English,Maths,Science");
				break;
			case 2:
				switch(branch){
					case 'C':
						System.out.println("Operating System, Java, Data Structure");
						break;
					case 'E':
						System.out.println("Micro processors, Logic switching theory");
						break;
					
					case 'M':
						System.out.println("Drawing, Manufacturing Machines");
						break;
					default: System.out.println("Selected the invalid branch!!");
				}
				break;

			case 3:
				switch(branch){
					case 'C':
						System.out.println("Computer Organization, MultiMedia");
						break;
					case 'E':
						System.out.println("Fundamentals of Logic Design, Microelectronics");
						break;
					
					case 'M':
						System.out.println("Internal Combustion Engines, Mechanical Vibration");
						break;
					default: System.out.println("Selected the invalid branch!!");
				}
				break;

			case 4:
				switch(branch){
					case 'C':
						System.out.println("Data Communication and Networks, Machine Learning");
						break;
					case 'E':
						System.out.println("Embedded System, Image Processing");
						break;
					
					case 'M':
						System.out.println("Production Technology, Thermal Engineering");
						break;
					default: System.out.println("Selected the invalid branch!!");
				}
				break;

			default: System.out.println("Selected the invalid year!!");
			
		}	
	}
}