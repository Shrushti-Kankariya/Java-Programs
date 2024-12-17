
public class StudentMultilevel {
	int roll;
	String name;
	
	public void setData(int roll , String name) {
		this.roll = roll;
		this.name = name;
	}
	
	public void showData() {
		System.out.println("Roll No : " + roll);
		System.out.println("Name of student : " + name);
	}
}
