// An algorithm to swap two number using third variable


public class SwapUsingVar {
    public static void main(String[] args) {
	int a = 74;
	int b = 49;
	
	System.out.println("The value of a is : " + a);
	System.out.println("The value of b is : " + b);

	int c = a;
	a = b;
	b = c;
	
        System.out.println("The value of a is : " + a);
	System.out.println("The value of b is : " + b);

	
    }
}
