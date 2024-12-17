
public class ThreadDemo1 {
	public static void main(String[] args) {
		MessageThread t1 = new MessageThread();
		//t1.start(); //we use start method to call the run method so it will register it with time scheduler so it run thread or
					//if we directly call run method so it is a normal call
		
		TableThread t2 = new TableThread();
		//t2.start();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		t1.setName("print");
		System.out.println(t1);
		t1.isDaemon();
		System.out.println(t1.getPriority());
		
	}
}
