
// Alogrithm to print the total expenses of birthday party

public class Expense {
    public static void main(String[] args) {
	int total_no_of_frds = 25;
	int per_plate_charge = 250;
	int return_gift_charge = 180;

	double total = total_no_of_frds * per_plate_charge + total_no_of_frds * return_gift_charge;
	
	
        System.out.println("The total expense of the party is " + total);
	
    }
}
