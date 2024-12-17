
public class Employee {
	int empid;
	String name;
	float salary;
	
	public void setData(int empid , String name , float salary){
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public void showData() {
		System.out.println("Employee Id : " + empid);
		System.out.println("Employee Name : " + name);
		System.out.println("Salary : " + salary);
		
	}
}
