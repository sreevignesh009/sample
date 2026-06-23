import java.util.*;

// Interface
interface EmployeeDetails {
    void displayDetails();
}

// Class implementing Interface
class Employee implements EmployeeDetails {

    // Variables
    String name;
    int age;
    double salary;

    // Constructor
    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method
    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Salary        : " + salary);
    }

    // Method with condition
    void checkEligibility() {
        if (age >= 21) {
            System.out.println(name + " is eligible to work.");
        } else {
            System.out.println(name + " is not eligible to work.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        // Object Creation
        Employee emp = new Employee("Sri Vignesh", 22, 30000);

        // Calling Methods
        emp.displayDetails();
        emp.checkEligibility();

        System.out.println("\n----- Array -----");

        // Array
        String[] skills = {"Java", "OOP", "Collections"};

        // Loop
        for (String skill : skills) {
            System.out.println(skill);
        }

        System.out.println("\n----- List -----");

        // List Collection
        List<String> technologies = new ArrayList<>();

        technologies.add("Java");
        technologies.add("SQL");
        technologies.add("Git");

        for (String tech : technologies) {
            System.out.println(tech);
        }

        System.out.println("\n----- Map -----");

        // Map Collection
        Map<Integer, String> projects = new HashMap<>();

        projects.put(101, "Employee Management");
        projects.put(102, "Student Portal");

        for (Map.Entry<Integer, String> entry : projects.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\n----- Exception Handling -----");

        // Exception Handling
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("\nProgram Executed Successfully.");
    }
}