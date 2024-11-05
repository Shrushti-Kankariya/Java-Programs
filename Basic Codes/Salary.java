
// Alogrithm to print the total salary
public class Salary {
    public static void main(String[] args) {
	int basic = 25000;
	double da = basic * 8/100;
	double hra = basic * 10/100;


	double total = basic  + da + hra;
	
	
        System.out.println("The total salary is " + total);
	
    }
}
