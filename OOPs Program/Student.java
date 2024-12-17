
public class Student {
	String name;
	int roll_no ;
	int age;
	
	Student(){
		this("Shrushti",25,22);
	}
	
	Student(String name,int roll_no,int age){
		this.name = name;
		this.roll_no = roll_no;
		this.age = age;
	}
	
	public String toString() {
		return "Name : " + name + ", Roll_no = " + roll_no + ", Age : " + age;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
	}
	
}
