import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer>list1 = new ArrayList<Integer>();
		list1.add(23);
		list1.add(34);
		list1.add(45);
		
		System.out.println("First way : ");
		for(int i=0;i<list1.size();i++) {
			System.out.print(" "+list1.get(i));
		}
		
		System.out.println("\nSecond way : ");
		for(Integer n : list1) {
			System.out.print(" "+n);
		}
		
		System.out.println("\nThird way : ");
		Iterator i1 = list1.iterator();
		while(i1.hasNext()) {
			System.out.print(" "+i1.next());
		}
		
		Collections.sort(list1);
		System.out.println("\n"+list1);
		Collections.reverse(list1);
		System.out.println(list1);
	}
}
