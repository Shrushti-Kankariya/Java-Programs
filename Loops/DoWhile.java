// menu driven program using do while loop 

import java.util.Scanner;

class DoWhile{
	public static void main(String[] args){
		int ch,no,reverse;
		Scanner sc = new Scanner(System.in);

		do{
			System.out.println("1. Print Square and cube of any number ");
			System.out.println("2. Print the square root of any number  ");
			System.out.println("3. Print the reverse of any number ");
			System.out.println("4. Exit ");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch){
				case 1 : System.out.println("Enter the number : ");
					no = sc.nextInt();
					System.out.println("The square of the number is "+ no * no + " and the cube of that number is " + no * no* no );
					break;

				case 2 : System.out.println("Enter the number : ");
					no = sc.nextInt();
					System.out.println("The square root of the number is "+ Math.sqrt(no));
					break;

				case 3 : System.out.println("Enter the number : ");
					no = sc.nextInt();
					reverse = 0;
    					while (no != 0) {
        					reverse = reverse * 10 + no % 10;
        					no /= 10;
   					}
    					System.out.println("Reverse : " +  reverse);
					break;

				case 4 : break;



			}
		}
		while(ch!=4); 
	}
}