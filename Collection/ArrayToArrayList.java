import java.util.*;

public class ArrayToArrayList {
	public static void main(String[] args) {
		Integer [] a1 = {23,2,45,65,12,30};
		System.out.print("Array:"+Arrays.toString(a1));
		List list1 = Arrays.asList(a1);
		
		System.out.println("\nArrayList:"+list1);
		
		Collections.sort(list1);
		
		System.out.println("Sorted :"+list1);
		
	}
}
