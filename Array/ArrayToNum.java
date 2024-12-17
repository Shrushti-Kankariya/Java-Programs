import java.util.Scanner;
class ArrayToNum{

	void convertToNumber(int [] a){
		int no =0;
		for(int i=0;i<a.length;i++){
			no = no * 10 + a[i];
			
		}
		System.out.println(no);
	}

	/* by using return method
		int convertToNumber(int [] a){
			int no =0;
			for(int i=0;i<a.length;i++){
				no = no * 10 + a[i];
			
			}
		return no;
	}

*/	
	public static void main(String [] args){
	
		int [] a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 numbers");
		for(int i=0;i<10;i++){
			a[i] = sc.nextInt();
		}

		ArrayToNum a1 = new ArrayToNum();
		a1.convertToNumber(a);	
		// int n = a1.convertToNumber(a);  //by using return method
	}	
}