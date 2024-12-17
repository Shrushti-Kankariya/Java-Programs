
import java.util.Scanner;

public class ArithmeticExceptionExample {
	public void show() {
		int a,b;
		System.out.println("Enter any two number : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addition : " + (a+b));
		
		try {
			System.out.println("Division : " + (a/b));
		}
		catch(ArithmeticException e) {
//			System.out.println(e);
//			e.printStackTrace();
			System.out.println("second number should not be 0 for division");
		}
		System.out.println("Subtraction : " + (a-b));
		System.out.println("Multiplication : " + (a*b));	
		
	}
	
	public static void main(String[] args) {
		ArithmeticExceptionExample a1 = new ArithmeticExceptionExample();
		a1.show();
	}
}
