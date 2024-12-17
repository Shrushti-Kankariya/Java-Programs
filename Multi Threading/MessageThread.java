

/*
 * class  Thread implements Runnable{
 * 	public void run(){
 * 
 * 	}
 * }
 * 
 * */
public class MessageThread extends Thread{

		public void run() {
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(1000); // 1000 milisec means 1 sec
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Good morning !");
			}
		}
}
