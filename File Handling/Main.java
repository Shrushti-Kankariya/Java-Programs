import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		//Book [] b = new Book[10];
		//b[0] = new Book(1001,"Core Java","Xyz");
		FileWriter f1 = new FileWriter("book.txt");
		f1.write("1001 Core Java EBalgurusamy");
		f1.write("\n1002 Python EBalgurusamy");
		
		f1.close();
		
	}
}
