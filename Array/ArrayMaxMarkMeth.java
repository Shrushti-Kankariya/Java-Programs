import java.util.Scanner;

class ArrayMaxMarkMeth{

	void acceptArray(){

		int[] marks = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 10 students : ");
		for(int i=0;i<10;i++)
		{
			marks[i] = sc.nextInt();
		}

		findMaxMarks(marks); // calling the method because we have to use the array in another method
		
	}

	void findMaxMarks(int []marks){
		
		int max = marks[0];

		for(int i=1;i<10;i++)
		{
			if(marks[i]>max){
				max = marks[i];
			}
		}
		System.out.println("Highest marks : " + max);
	}

	public static void main(String[] args)
	{
		ArrayMaxMarkMeth m1 = new ArrayMaxMarkMeth();
		m1.acceptArray();
		
	}
}