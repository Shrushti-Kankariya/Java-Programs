import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Test {
	
	static void removeDuplicates(int [] a) {
		LinkedHashSet s1 = new LinkedHashSet();
		for(int i=0;i<a.length;i++) {
			s1.add(a[i]);
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		int [] a1 = {45,87,98,56,3,47,45,98,4};
		removeDuplicates(a1);
		
	}
}
