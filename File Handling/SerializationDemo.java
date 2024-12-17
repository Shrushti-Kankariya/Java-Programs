import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		Employee e1 = new Employee(25,"Shru","shush","Shrushti",95);
		FileOutputStream f1 = new FileOutputStream("employee.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(f1);
		oos.writeObject(e1);
		System.out.println("Employee object is serialized");
	}
}
