import java.io.*;

public class FileCopyDemo {
	public static void main(String[] args) {
		try {
			FileReader f1 = new FileReader("book.txt");
			FileWriter f2 = new FileWriter("newbook.txt");
			int c;
			while((c=f1.read())!=-1) {
				System.out.print((char)c);
				f2.write((char)c);
			}
			f1.close();
			f2.close();
		}
		catch(Exception e) {
			
		}
	}
}
