import java.util.ArrayList;
import java.util.Scanner;

public class MiniProject {
	static ArrayList <Product> a1;
	
	public static void addProduct() {
		System.out.println("Enter the product id");
		int id = sc.nextInt();
		System.out.println("Enter the product name");
		String n = sc.next();
		System.out.println("Enter the product price");
		float p = sc.nextFloat();
		
		Product p1 = new Product(id,n,p);
		a1.add(p1);
		System.out.println("Product added successfully");
	}
	
	public static void removeProduct() {
		System.out.println("Enter product id to remove : ");
		int id = sc.nextInt();
		
		for(int i=0;i<a1.size();i++) {
			if(a1.get(i).getPid()==id) {
				a1.remove(i);
				System.out.println("Product is removed successfully");
			}
		}
		System.out.println("Product not found");
	}
	
	public static void updateProduct() {
		System.out.println("Enter product id to update : ");
		int id = sc.nextInt();
		
		for(Product p : a1) {
			if(p.getPid()==id) {
				System.out.println("Enter new name : ");
				String name = sc.next();
				System.out.println("Enter new price : ");
				float price = sc.nextFloat();
				
				p.setName(name);
				p.setPrice(price);
				System.out.println("Product updated successfully.");
				
			}
		}
		System.out.println("Product not found");
	}
	
	
	public static void showProducts() {
		for(Product x : a1) {
			System.out.println(x);
		}
	}
	
	public static void findProduct() {
		System.out.println("Enter the product id to find : ");
		int id = sc.nextInt();
		
		for(Product p:a1) {
			if(p.getPid()==id) {
				System.out.println("Product Found "+ p);
				return;
			}
		}
		System.out.println("Product not found");
	}
	
	public static void minProduct() {
		Product min = a1.get(0);
		for(Product p : a1 ) {
			if(p.getPrice()<min.getPrice()) {
				min = p;
			}
		}
		System.out.println("Product with minimum price : "+ min);
	}
	
	public static void maxProduct() {
		Product max = a1.get(0);
		for(Product p : a1 ) {
			if(p.getPrice()>max.getPrice()) {
				max = p;
			}
		}
		System.out.println("Product with maximum price : "+ max);
	}
	
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		a1 = new ArrayList<Product>();
		int ch;
		do {
			System.out.println("1. Add new product");
			System.out.println("2. Remove product");
			System.out.println("3. Update product");
			System.out.println("4. Show all products");
			System.out.println("5. Find product");
			System.out.println("6. Min price of product");
			System.out.println("7. Max price of product");
			System.out.println("8. Exit");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				addProduct();
				break;
				
			case 2:
				removeProduct();
				break;
				
			case 3:
				updateProduct();
				break;
				
			case 4:
				showProducts();
				break;
				
			case 5:
				findProduct();
				break;
				
			case 6:
				minProduct();
				break;
				
			case 7:
				maxProduct();
				break;
			}
		}
		while(ch!=8);
	}
}
