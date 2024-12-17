/* Print the multiplication table of 5*/

class For5Table{
	public static void main(String[] args){
		int n = 5;
		int mult;
		for(int i =1 ; i <= 10 ; i++){
			mult = n * i;
			System.out.println( n + " X " + i + " = " + mult);
			
		}
		
	}
}