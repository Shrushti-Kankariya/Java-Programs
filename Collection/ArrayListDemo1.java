import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add(86.65);
		a1.add("Hello");
		a1.add(true);
		
		
		//1st way : System.out.println(a1);
		
		/* 2nd way : for(int i=0;i<a1.size();i++) {
						System.out.println(a1.get(i));
						}
		*/
		//  index value
		a1.add(3,96);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("\n");
		a1.remove(2);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
	}
}
