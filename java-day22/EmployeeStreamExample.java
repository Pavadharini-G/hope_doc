import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Employee {
    String name;
    String dept;
    double salary;
    int age;

    Employee(String name, String dept, double salary, int age) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + dept + " - " + salary + " - " + age;
    }
}

public class EmployeeStreamExample {
    public static void main(String[] args) {

        // Supplier to create employee list
        Supplier<List<Employee>> supplier = () -> List.of(
                new Employee("A", "dev", 60000, 25),
                new Employee("B", "hr", 40000, 30),
                new Employee("C", "dev", 80000, 28),
                new Employee("D", "support", 30000, 35),
                new Employee("E", "dev", 55000, 26)
        );

        List<Employee> employees = supplier.get();

        // 1. Filter by dept = "dev"
        List<Employee> devEmployees = employees.stream()
                .filter(e -> e.dept.equalsIgnoreCase("dev"))
                .collect(Collectors.toList());

        System.out.println("Dev Employees: " + devEmployees);

        // 2. Salary > 50k
        List<Employee> highSalary = employees.stream()
                .filter(e -> e.salary > 50000)
                .collect(Collectors.toList());

        System.out.println("Salary > 50k: " + highSalary);

        // 3. Total salary (sum)
        double totalSalary = employees.stream()
                .mapToDouble(e -> e.salary)
                .sum();

        System.out.println("Total Salary: " + totalSalary);

        // 4. Average salary
        double avgSalary = employees.stream()
                .mapToDouble(e -> e.salary)
                .average()
                .orElse(0);

        System.out.println("Average Salary: " + avgSalary);

        // 5. Total count of employees
        long count = employees.stream().count();

        System.out.println("Employee Count: " + count);
    }
}
