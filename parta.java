import java.util.*;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', age=%d, salary=%.2f}", name, age, salary);
    }
}

public class parta {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Arayn", 30, 55000));
        employees.add(new Employee("Krish", 25, 60000));
        employees.add(new Employee("Chaitanya", 35, 50000));
        employees.add(new Employee("Daksh", 28, 65000));

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println("\nSorted by Age:");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("\nSorted by Salary (Descending):");
        employees.forEach(System.out::println);
    }
}
