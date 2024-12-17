
public class SCPDemo {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		// these create 3 object
		
		System.out.println(s1.equals(s2)); //check the content
		System.out.println(s1==s2); //check address
	}
}
