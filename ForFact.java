/* Print the factorial of a number*/

class ForFact{
	public static void main(String[] args){
		int fact=1;
		int n = 5;
		for(int i =1 ; i <= 5 ; i++){
			fact = fact * i;
			
		}
		System.out.println("Factorial of 5 is : " + fact);
	}
}