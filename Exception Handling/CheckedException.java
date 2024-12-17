import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) throws IOException {
		FileWriter f1 = new FileWriter("sample.txt");
		f1.write("Hello. A sample file is created through my process.");
		f1.close();
	}
}
