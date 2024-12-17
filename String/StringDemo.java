
public class StringDemo {
	
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Abca";
		
		char [ ] a = {'a','b','c','d'};
		
		String s3 = new String(a);
		System.out.println(s3);
		System.out.println(s3.length());
		
		System.out.println(s3.charAt(2));
		System.out.println(s3.codePointAt(2));
		System.out.println(s3.codePointBefore(2));
		System.out.println(s3.codePointCount(0, 4));//while counting it doesn't count end index
		System.out.println(s3.compareTo(s2));//diff of ascci value where the character is not same
		System.out.println(s3.compareToIgnoreCase(s2));
	}

}
