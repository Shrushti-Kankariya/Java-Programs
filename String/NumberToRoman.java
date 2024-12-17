
public class NumberToRoman {
	
	public static void roman(int no) {
		// 1-i		5 v		10 x	50 l 	100 c	500 d 	1000 m
		
		
		int []  a = {1000,500,100,50,10,5,1};
		int cnt=0;
		String rm = "MDCLXVI";
		while(no>0) {
			int d = no/a[cnt];
			for(int i=1; i<=d; i++) {
				System.out.print(rm.charAt(cnt));
			}
			no = no%a[cnt];
			cnt++;
		}
		
	}
	
	
	public static void main(String[] args) {
		int number = 95;
		roman(number);
	}
}
