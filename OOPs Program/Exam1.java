
public class Exam1 extends StudentMultilevel {
	int m1,m2;
	
	public void setMarks(int m1, int m2) {
		this.m1 = m1;
		this.m2 = m2;
	}
	
	public void showMarks() {
		System.out.println("Marks of first student : " + m1);
		System.out.println("Marks of second student : " + m2);
	}
}
