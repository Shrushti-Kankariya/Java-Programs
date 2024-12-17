import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add(12);
		t1.add(20);
		t1.add(15);
		t1.add(25);
		t1.add(13);
		
		//always store the element in ascending order
		System.out.println(t1);
		
		
		System.out.println(t1.descendingSet());
		}
}
