
public class Fruits {
	public static void main(String[] args) {
		Fruits f1 = new Fruits();
		System.out.println(f1);
		System.out.println(f1.hashCode());
		
		Fruits f2 = new Fruits();
		System.out.println(f2);
		System.out.println(f2.hashCode());
		
		System.out.println(f1==f2);
		
		Fruits f3 = f2;
		System.out.println(f2==f3);
	}
}
