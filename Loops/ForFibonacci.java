/* Print the Fibonacci series upto 10 terms*/

class ForFibonacci{
	public static void main(String[] args){
		int a = 0;
		int b = 1;
		for(int i =1 ; i <= 10 ; i++){

			System.out.println(a + " ");
			int next = a + b;
			a = b;
			b =next;
		}
		
	}
}