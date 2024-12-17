
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args){
		try {
			FileReader f1 = new FileReader("book.txt");
			/*while(true) {
				int c = f1.read();
				if(c == -1)
					break;
				System.out.print((char)c);
			}*/
			int c;
			while((c=f1.read())!=-1) {
				System.out.print((char)c);
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
