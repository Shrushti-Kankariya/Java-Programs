import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) {
		try {
			RandomAccessFile f1 = new RandomAccessFile("book.txt","rw");
			//getFilePointer method will return the file pointer position
			System.out.println(f1.getFilePointer());
			
			//seek method moves the file pointer at any required place
			f1.seek(6);
			f1.write('o');//it will replace the character 
			System.out.println((char)f1.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
