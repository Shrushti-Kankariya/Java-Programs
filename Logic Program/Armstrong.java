// prime number is a number which is divisible by 1 and itself

import java.util.Scanner;

class Armstrong{
	public static void main(String [] args){
		int no,d,sum=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		no = sc.nextInt();
		temp = no;

		while(no>0){
			d = no % 10;
			sum = sum + d*d*d;
			no = no/10;
		}

		if(sum == temp){
			System.out.println("The number is Armstrong.");
		}
		else{
			System.out.println("The number is not a Armstrong");
		}
	}
}

