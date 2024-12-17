
public class ThreadMain {
	public static void main(String[] args) {
		ThreadPrimeNum t1 = new ThreadPrimeNum();
		t1.start();
		
		ThreadArmstrongNum t2 = new ThreadArmstrongNum();
		t2.start();
	}
}
