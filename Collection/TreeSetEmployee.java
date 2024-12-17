import java.util.TreeSet;

public class TreeSetEmployee {
	public static void main(String[] args) {
		TreeSet<Employee> t1 = new TreeSet<Employee>();
		t1.add(new Employee(101,"Shru",40000));
		t1.add(new Employee(103,"karu",60000));
		t1.add(new Employee(103,"karu",60000));
		System.out.println(t1);
	}
}
