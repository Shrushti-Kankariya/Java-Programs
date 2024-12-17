
public class ThreadArmstrongNum extends Thread {
	public void run() {
		int no;

		for(no=1;no<=1000;no++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			check(no);
		}
		
	}
	public static void check(int no){
		int d,sum=0,temp;
		temp = no;

		while(no>0){
			d = no % 10;
			sum = sum + d*d*d;
			no = no/10;
		}

		if(sum == temp){
			System.out.println(temp);
		}
	}
}
