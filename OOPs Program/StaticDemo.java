
public class StaticDemo {
	int no;
	static int amt;
	
	public static void show() {
		System.out.println("Only static members are accessed");
		System.out.println(amt);
	}
	
	public void greet() {
		System.out.println("Good Morning");
	}
	//static block
	static {
		System.out.println("I am inside static block");
	}
	
	//non-static block
	{
		System.out.println("I am non static block");
	}
	
	public static void main(String[] args) {
		System.out.println("I am inside main");
		
		StaticDemo d1 = new StaticDemo();
		
		
		StaticDemo.show();
		
		d1.greet();
				
	}
}
