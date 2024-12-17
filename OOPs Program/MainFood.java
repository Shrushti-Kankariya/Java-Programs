/*
public class MainFood {
	
	
	public static void main(String[] args) {
		Food f1;
		
		f1 = new Maggie();
		f1.prepare();
		
		System.out.println("___________________________________");
		
		f1 = new Sandwich();
		f1.prepare();
	}
}
*/
// two methods to write

public class MainFood {
	public static void taste(Food f1) {
		f1.prepare();
	}
	
	public static void main(String[] args) {
		
		
		Maggie m1 = new Maggie();
		m1.display();
		System.out.println("___________________________________");
		
		Sandwich s1 = new Sandwich();
		taste(m1);
	}
}