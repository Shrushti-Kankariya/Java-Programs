// compile time polymorphism 
public class MethodOverloadingArea {
	public void area(float radius) {
		System.out.println("Area of circle : " + (3.142  * radius * radius));
	}
	public void area(int len,int bre) {
		System.out.println("Area of rectangle : " + (len * bre));
	}
	public void area(float b ,float h) {
		System.out.println("Area of triangle : " + (0.5 * b * h));
	}
	
	public static void main(String[] args) {
		MethodOverloadingArea a1 = new MethodOverloadingArea();
		a1.area(5f);
		a1.area(5,4);
		a1.area(2f,10f);
	}
}
