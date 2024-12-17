
public class PlayerMain {
	public static void main(String[] args) {
		Player p1 = new Player(45, "Rohit Sharma", "Cricket");
		Player p2 = new Player(45, "Rohit Sharma", "Cricket");
		// == this operator always check and compare the references
		System.out.println(p1==p2);
		
		//
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}
}
