import java.util.Scanner;

class MatrixBasic{
	public static void main(String [] args){
	int [][] m = new int[3][4];
	int i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element in 3x4 matrix : ");

	for(i=0;i<3;i++){
		for(j=0;j<4;j++){
			m[i][j] = sc.nextInt();
		}
	}

	System.out.print("The given matrix is : \n");

	for(i=0;i<3;i++){
		for(j=0;j<4;j++){
			System.out.print(m[i][j]+ " ");
		}
		System.out.println();
	}

}		
}