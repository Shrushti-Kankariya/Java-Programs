
public class Demo2 {
	public static int sum(int n1,int n2) {
		return n1+n2;
	}
	
	public static int sum(int n1,int n2, int n3) {
		return n1+n2+n3;
	}
	
	//variable arguments or array
	public static int sum(int ...k) {
		int total=0;
		for(int i=0;i<k.length;i++) {
			total = total+k[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(45,67));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
	}
}
