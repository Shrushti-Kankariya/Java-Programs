import java.util.Comparator;

class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        System.out.println("Comparing: " + e1.getSalary() + " and " + e2.getSalary());
        if (e1.getSalary() > e2.getSalary()) {
            return 1; // e1 is greater
        } else if (e1.getSalary() < e2.getSalary()) {
            return -1; // e2 is greater
        } else {
            return 0; // Both are equal
        }
    }
}
