// an code to print the grade for students

import java.util.Scanner;
public class Grade{

	public static void main(String[] args){

		int m1,m2,m3;
		System.out.println("Marks of subject ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 1st subject : ");
		m1 = sc.nextInt();
		System.out.println("Enter the marks of 2nd subject : ");
		m2 = sc.nextInt();
		System.out.println("Enter the marks of 3rd subject : ");
		m3 = sc.nextInt();

		int total = m1 + m2 + m3;
		int average = total / 3;

		if ( average >= 80){
			System.out.println("Distinction");
		}
		else{
			if(average >= 60){
				System.out.println("First Class");
			} 
			else{
				if(average >= 50){
					System.out.println("Second Class");
				}
				else{
					if(average >=40){
						System.out.println("Pass");
					}
					else{
						System.out.println("Fail");
					}
				}
			}
		}
	}
}