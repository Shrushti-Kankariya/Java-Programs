import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        List<Integer> l1 = null; // Declare a generic List of Integer type
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Linked List");
        System.out.println("2. Array List");
        System.out.print("Enter your choice: ");
        int opt = sc.nextInt();

        if (opt == 1) {
            l1 = new LinkedList<>();
            System.out.println("LinkedList created");
        } else if (opt == 2) {
            l1 = new ArrayList<>();
            System.out.println("ArrayList created");
        } else {
            System.out.println("Invalid choice");
            return;
        }

        l1.add(10);
        l1.add(20);
        l1.add(30);

        System.out.println("List elements: " + l1);
        sc.close();
    }
}