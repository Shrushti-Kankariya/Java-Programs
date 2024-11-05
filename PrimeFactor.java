// Print the factors of the number
// 24 	= 12 * 2 
//	= 2 * 2 * 6 
//	= 2 * 2 * 2 * 3

import java.util.Scanner;
class PrimeFactor{
	public static void main(String [] args){
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to have prime factors of it : ");
		no = sc.nextInt();
		int i = 2;
		while(no>1){
			if(no%i == 0){
				System.out.print(i + " ");
				no = no / i;
			}
			else{
				i++;
			}
		}
	}
}