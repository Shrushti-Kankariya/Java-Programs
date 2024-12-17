
public class ExceptionExample {
	public static void main(String ...args ) {
		try {
		System.out.println("Length of args array : "+args.length);
		int [] a  = {2,3,4,5,6};
		System.out.println(a.length/args.length);
		System.out.println("The index of the array 'a' is:"+a[5]);
		}
		catch(ArithmeticException e){
			System.out.println("Command line arguments are not passed.\n"+"So plz run the code again by passing paramerters");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The given index is wrong.");
		}
		catch(Exception e) {
			System.out.println("Some Error");
		}
	}
}
