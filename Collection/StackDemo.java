import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		s1.push(23);
		s1.push(25);
		s1.push(28);
		
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
		
		System.out.println(s1.peek());
	}
}
