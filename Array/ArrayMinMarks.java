import java.util.Scanner;

class ArrayMinMarks{
	public static void main(String[] args)
	{
		int[] marks = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of 10 students : ");
		for(int i=0;i<10;i++)
		{
			marks[i] = sc.nextInt();
		}
		
		int min = marks[0];

		for(int i=1;i<10;i++)
		{
			if(marks[i]<min){
				min = marks[i];
			}
		}
		System.out.println("Lowest marks : " + min);
	}
}