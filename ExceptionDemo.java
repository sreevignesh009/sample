public class ExceptionDemo {

public static void main(String[] args) {

try {
int[] numbers = {10, 20, 30};
System.out.println(numbers[3]);
}

catch (Exception e) {
System.out.println("Invalid index");
}
finally {
System.out.println("Program completed");
}
}
}