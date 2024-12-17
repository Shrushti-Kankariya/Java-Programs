import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int [] a = {100,20,310,140,50,6};
		/*Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		*/
		Arrays.sort(a, 0, 3);
		System.out.println(Arrays.toString(a));
	}
}
