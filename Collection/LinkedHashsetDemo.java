import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashsetDemo {
		public static void main(String[] args) {
			LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>();
			s1.add(10);
			s1.add(50);
			s1.add(20);
			s1.add(10);
			s1.add(90);
			s1.add(50);
			
			//set stored elements in ordered 
			// It can not store duplicate element
			
			System.out.println(s1);
			
			Iterator i1 = s1.iterator();
			while(i1.hasNext()) {
				System.out.println(i1.next());
			}
		}
}
