import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		String s1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any string : ");
		s1 = sc.nextLine();
		StringBuffer s2 = new StringBuffer(s1); //string is convert into string buffer
		// number into :== 
		// string String s1 = String.valueOf(no);
		
		s2.reverse();
		System.out.println(s2);
		if(s1.equals(s2.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
