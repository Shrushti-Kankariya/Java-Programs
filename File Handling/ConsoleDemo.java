import java.io.Console;

public class ConsoleDemo {
	public static void main(String[] args) {
		//Console c1 = new Console(); 	-	it is not right way
		Console c1 = System.console();
		System.out.println("Enter your user name:");
		String un = c1.readLine();
		
		System.out.println("Enter your password : ");
		char [] p = c1.readPassword();
		String pwd = new String(p);
		
		if(un.equals("Student")&& pwd.equals("stud123")) {
			System.out.println("Congratulations! \nLogin Successful");
		}
		else {
			System.out.println("Sorry ! Wrong username or password.");
		}
	}
}
