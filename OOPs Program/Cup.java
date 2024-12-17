// Constructor chaining helps to call multiple constructors
public class Cup {
	String type;
	int size;
	int price;
	
	Cup() {
		// this() call the constructor of the same class
		//these is also called as constructor chaining
		this("Glass", 20, 50);
		
		System.out.println("This is defualt constructor");
	}
	
	Cup(String type , int size, int price){
		this.type = type;
		this.size = size;
		this.price = price;
	}
	
	public String toString() {
		return "Cup [type=" + type + ", size=" + size + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Cup c1 = new Cup();
		System.out.println(c1);
		
	}
}
