
public class ThreadPrimeNum extends Thread{

	public void run() {
		for(int n=2;n<=100;n++) {
			boolean isPrime = true;
			for (int i = 2; i <= n / 2; i++){
	    			if (n % i == 0) {
	        			isPrime = false;
	        			break;
	    			}
			}

			if(isPrime) {
				System.out.println(n+" ");
			}
		}		
	}
}
