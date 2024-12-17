
public class ThreadRunCall {
	public static void main(String[] args) throws InterruptedException {
		MessageThread t1 = new MessageThread();
		TableThread t2 = new TableThread();
		t1.run();
		t2.run();
		// without start it will run as the normal code
		
		//after using start method it will run as thread
		
		t1.start();
		t1.join();
		t2.start();
	}
}
