import java.util.ArrayList;

class Employee {
    private String name;
    private String role;
    private double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 2: Create an ArrayList and Add Employees
        ArrayList employeeList = new ArrayList<>();

        Employee employee1 = new Employee("Alice", "Developer", 60000.0);
        Employee employee2 = new Employee("Bob", "Designer", 50000.0);
        Employee employee3 = new Employee("Charlie", "Manager", 75000.0);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        // Step 3: Display the Employee Details without using a loop
        Employee emp1 = (Employee) employeeList.get(0);
        System.out.println("Name: " + emp1.getName() + ", Role: " + emp1.getRole() + ", Salary: " + emp1.getSalary());

        Employee emp2 = (Employee) employeeList.get(1);
        System.out.println("Name: " + emp2.getName() + ", Role: " + emp2.getRole() + ", Salary: " + emp2.getSalary());

        Employee emp3 = (Employee) employeeList.get(2);
        System.out.println("Name: " + emp3.getName() + ", Role: " + emp3.getRole() + ", Salary: " + emp3.getSalary());
    }
}
