import java.util.Scanner;

class ArrayMaxMarks{
	public static void main(String[] args)
	{
		int[] marks = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of 10 students : ");
		for(int i=0;i<10;i++)
		{
			marks[i] = sc.nextInt();
		}
		
		int max = marks[0];

		for(int i=1;i<10;i++)
		{
			if(marks[i]>max){
				max = marks[i];
			}
		}
		System.out.println("Highest marks : " + max);
	}
}