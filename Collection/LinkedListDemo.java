import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addFirst(12);
		list1.addLast(12);
		list1.add(14);
		list1.add(16);
		System.out.println(list1);
		
		Iterator i1 = list1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		//list iterator
		ListIterator l1 = list1.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		
		//reverse order
		System.out.println("List in reverse order: ");
		ListIterator l2 = list1.listIterator(list1.size());
		while(l2.hasPrevious()) {
			
			System.out.println(l2.previous());
		}
		
		
		ArrayList list2 = new ArrayList();
		list2.addFirst(23);
		list2.addLast(33);
		list2.removeLast();
		System.out.println(list2);
	}
}
