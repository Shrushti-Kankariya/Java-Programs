import java.io.*;

public class FileAnalysis {
	public static void main(String[] args) {
		
		
		int capletter=0;
		int smallletter=0;
		int digits=0;
		int space = 0;
		
		try {
			FileReader f1 = new FileReader("book.txt");
			
			int c;
			while((c= f1.read())!=-1) {
				if(Character.isUpperCase(c)) {
					capletter++;
				}
				else if(Character.isLowerCase(c)) {
					smallletter++;
				}
				else if(Character.isDigit(c)) {
					digits++;
				}
				else if(Character.isWhitespace(c)) {
					space++;
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Capital Letter : " + capletter);
		System.out.println("Small Letter : " + smallletter);
		System.out.println("Digit : " + digits);
		System.out.println("White Space : " + space);
		
	}
}
