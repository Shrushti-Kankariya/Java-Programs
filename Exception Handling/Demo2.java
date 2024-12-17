import java.util.Scanner;

public class Demo2 {
	public void show() {
		int a,b;
		System.out.println("Enter any two number : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addition : " + (a+b));
		System.out.println("Subtraction : " + (a-b));
		System.out.println("Multiplication : " + (a*b));
		System.out.println("Division : " + (a/b));
		
	}
}
