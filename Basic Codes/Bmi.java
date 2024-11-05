// Code to calculate the BMI

public class Bmi {
    public static void main(String[] args) {
	int weight = 70;
	double height = 5 * 0.39;

	double bmi = weight / height * height ;
	
        System.out.println("The BMI of the body is " + bmi);
	
    }
}
