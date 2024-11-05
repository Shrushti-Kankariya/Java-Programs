// An algorithm to accept a number and print whether it is even or odd
import java.util.Scanner;

public class EvenOdd{
	public static void main(String[] args){
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		no = sc.nextInt();

		if (no % 2 == 0 ){
		
			System.out.println("It is a even number");	

		}
		else{
			
			System.out.println("It is a odd number");
			

		}

	}

}