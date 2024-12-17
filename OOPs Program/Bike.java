
public class Bike {
	String company;
	String color;
	String type;
	
	//setter
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//getter
	
	public String getColour() {
		return color;
	}
	
	//default constructor
	
	public Bike() {
		
	}
	
	public String toString() {
		return "Bike Company : " + company + " Type : " + type + " Color : " + color;
	}
	
	// paramiterized 
	
	public Bike(String company,String color, String type) {
		this.company = company;
		this.color = color;
		this.type = type;
		
	}
	
	public static void main(String[] args) {
		Bike b1 = new Bike();
		Bike b2 = new Bike("Bajaj","Black","Petrol");
		b1.setColor("Black");
		System.out.println(b1);
		System.out.println(b2);
		
		
	}
}
