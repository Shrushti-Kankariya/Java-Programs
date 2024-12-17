// method overloading = same method with different parameter
// htese comes under polymorphism
public class MethodOverloading {
	public void show() {
		System.out.println("Hello");
	}
	public void show(int no) {
		System.out.println(no);
	}
	public void show(String msg) {
		System.out.println(msg);
	}
	public void show(String msg, int no) {
		for(int i=1;i<=no;i++) {
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.show();
		m1.show(10);
		m1.show("Welcome to tech World!!",5);
		
	}
}
