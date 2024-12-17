import java.util.Scanner;

public class StringNumPalindrome {
	public static void main(String[] args) {
		int no;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = sc.nextInt();
		//number is converted into string
		String s1 = String.valueOf(no);
		StringBuffer s2 = new StringBuffer(s1);
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
