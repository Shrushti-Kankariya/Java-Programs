import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(30);
		v1.add(10); //duplicate is allowed
		v1.addElement(50);
		
		System.out.println("Method 1 only for legacy classes");
		Enumeration e1 = v1.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
		System.out.println("\nMethod 2 for all");
		Iterator i1 = v1.iterator();
			while(i1.hasNext()) {
				System.out.println(i1.next());
			}
		
		System.out.println("\nNormal for loop");
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
		
		System.out.println("\nFor each loop if we use generic class");
		for(Integer x : v1) {
			System.out.println(x);
		}
	}
}
