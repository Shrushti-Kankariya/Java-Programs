import java.util.Scanner;

class SwitchDemo{
	public static void main(String[] args){
		int no1,no2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number : ");
		no1 = sc.nextInt();
		no2 = sc.nextInt();

		System.out.println("Please select your option : ");
		System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide 5.Modulus ");
		int opt = sc.nextInt();

		switch(opt){
			
			case 1: System.out.println("Addition : " + (no1 + no2));
				break;

			case 2: if(no1<no2){
					System.out.println("Subtraction : " + (no2 - no1));
					break;
				}
				else{
					System.out.println("Subtraction : " + (no1 - no2));
					break;
				}

			case 3: System.out.println("Multiplication : " + (no1 * no2));
				break;

			case 4: if(no1<no2){
					System.out.println("Division of given number is not carried out. Give 1st number greater than 2nd.");
					break;
				}
				else{
					System.out.println("Division : " + (no1 / no2));
					break;
				}

				

			case 5: System.out.println("Modulus : " + (no1 % no2));
				break;

			default: System.out.println("Please select valid option.");

		}
	
	}

}