public class Employee {

    // Variables
    String name;
    char initial;
    int age;
    double salary;
    float height;

    // Constructor
    Employee(String name, char initial, int age, double salary, float height) {
        this.name = name;
        this.initial = initial;
        this.age = age;
        this.salary = salary;
        this.height = height;
    }

    // Method
    public void displayDetails() {
        System.out.println("Name    : " + name + " " + initial);
        System.out.println("Age     : " + age);
        System.out.println("Salary  : " + salary);
        System.out.println("Height  : " + height);
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        Employee emp1 = new Employee("Sri Vignesh", 'C', 22, 30000, 5.6f);
        Employee emp2 = new Employee("Sathish", 'A', 24, 35000, 6.1f);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}