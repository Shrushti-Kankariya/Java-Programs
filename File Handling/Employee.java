import java.io.Serializable;

//to provide the special permission for this class to serialize
//we must implements Serializable otherwise we will get nonserializable exception
public class Employee implements Serializable{
	int roll;
	String name;
	String username;
	 transient String password;
	int marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Employee(int roll, String name, String username, String password, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.username = username;
		this.password = password;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", marks=" + marks + "]";
	}
	
	
}
