
public class Tiger extends Animal {
	String food;
	
	Tiger(){
		super();
	}
	
	Tiger(String name, String type, String food){
		super(name,type);
		this.food = food;
	}
	
	public void test() {
		super.display();
		System.out.println(super.name);
	}
}
