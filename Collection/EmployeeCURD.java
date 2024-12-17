import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeCURD {
    static int empid;

    // Static block
    static {
        empid = 101;
    }

    // Instance initializer block
    {
        System.out.println("This is an instance initializer block");
    }

    public static void main(String[] args) {
        ArrayList<Employee> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opt;

        do {
            System.out.println("1. Add a new Employee");
            System.out.println("2. Show all employees");
            System.out.println("3. Delete any employee");
            System.out.println("4. Update the employee");
            System.out.println("5. Sort Employees according to name");
            System.out.println("6. Sort Employees according to Salary");
            System.out.println("7. Exit");
            System.out.print("Enter your option: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    int id = empid++;
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter the employee name: ");
                    String n = sc.nextLine();
                    System.out.print("Enter the salary: ");
                    float s = sc.nextFloat();
                    sc.nextLine(); // Consume newline
                    Employee e1 = new Employee(id, n, s);
                    list1.add(e1);
                    System.out.println("Employee Added successfully");
                    break;

                case 2:
                    for (Employee e : list1) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.print("Enter the employee id to delete: ");
                    id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    boolean flag = false;
                    for (Employee e : list1) {
                        if (e.getId() == id) {
                            list1.remove(e);
                            flag = true;
                            System.out.println("Employee removed");
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Employee not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter the employee id to update: ");
                    id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    flag = false;
                    for (Employee e : list1) {
                        if (e.getId() == id) {
                            System.out.print("Enter the new name: ");
                            n = sc.nextLine();
                            System.out.print("Enter the new salary: ");
                            s = sc.nextFloat();
                            sc.nextLine(); // Consume newline
                            e.setName(n);
                            e.setSalary(s);
                            flag = true;
                            System.out.println("Employee updated");
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Employee not found");
                    }
                    break;

                case 5:
                    Collections.sort(list1); // Sort by name (natural order)
                    for (Employee e : list1) {
                        System.out.println(e);
                    }
                    break;

                case 6:
                    Collections.sort(list1, new EmployeeSalaryComparator()); // Sort by salary
                    for (Employee e : list1) {
                        System.out.println(e);
                    }
                    break;
            }
        } while (opt != 7);
    }
}