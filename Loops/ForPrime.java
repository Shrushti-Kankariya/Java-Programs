/* check if the number is prime or not*/

class ForPrime{
	public static void main(String[] args){
		int n = 29;
		boolean isPrime = true;
		for (int i = 2; i <= n / 2; i++){
    			if (n % i == 0) {
        			isPrime = false;
        			break;
    			}
		}

		System.out.println(n + " is prime: " + isPrime);

	}
}