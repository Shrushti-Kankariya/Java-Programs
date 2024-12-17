
public class StudentMain {
	public static void main(String[] args) {
		try {
		Student s1 = new Student(101,"Shrushti",101);
		System.out.println(s1);
		}
		catch(InvalidMarksException e) {
			System.out.println(e);
		}
		Student s2 = new Student(102,"Neha",-9);
		Student s3 = new Student(131,"Asha",99);
	}
}
