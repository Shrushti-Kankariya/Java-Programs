// An algorithm to swap two numbers without using third variable


public class SwapWithoutUsingVar {
    public static void main(String[] args) {
	int a = 12;
	int b = 30;
	
	System.out.println("The value of a is : " + a);
	System.out.println("The value of b is : " + b);

	a = a + b;
	b = a - b;
	a = a - b;
	
        System.out.println("The value of a is : " + a);
	System.out.println("The value of b is : " + b);

	
    }
}
