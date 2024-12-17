import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet s1 = new HashSet();
		s1.add(10);
		s1.add(50);
		s1.add(20);
		s1.add(10);
		s1.add(90);
		s1.add(50);
		
		//set stored elements in random ordered 
		// It can not store duplicate element
		
		System.out.println(s1);
		
		Iterator i1 = s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
