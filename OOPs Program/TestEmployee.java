
public class TestEmployee {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		Typist t1 = new Typist();
		
		m1.setData(101,"Shrushti",20000f);
		m1.setBonus(5000f);
		
		m1.showData();
		m1.showBonus();
		
		t1.setData(131, "Sakshi", 15000f);
		t1.setWages(1000f);
		
		t1.showData();
		t1.showWages();
	}
}
