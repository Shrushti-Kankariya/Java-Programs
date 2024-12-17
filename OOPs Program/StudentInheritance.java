
public class StudentInheritance {
	int roll;
	String name;
	String email;
	String mobile;
	
	public void setData(int roll,String name, String email,String mobile) {
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		
	}
	
	public void showData() {
		System.out.println("Roll No : " + this.roll);
		System.out.println("Name : " + this.name);
		System.out.println("Email : " + this.email);
		System.out.println("Mobile : " + this.mobile);
		
	}
}
