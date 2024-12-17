import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name : ");
		String name = br.readLine();
		
		System.out.println("Enter the age :");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the salary : ");
		float salary = Float.parseFloat(br.readLine());
		
		//scanner can be used to read from file
		File f1 = new File("book.txt");
		Scanner sc = new Scanner(f1);
		System.out.println(sc.nextLine());
		
		
		//scanner can also be used to read from string
		String s1 = "Hello,My name is shrushti";
		sc = new Scanner(s1);
		System.out.println(sc.nextLine());
	}
}
