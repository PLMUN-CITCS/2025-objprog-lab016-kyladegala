public class MethodOverloading {

    // Method to print an integer
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Method to print a double
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Method to print a string
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }

    public static void main(String[] args) {
        // Calling overloaded methods
        printValue(10);         // Integer
        printValue(3.14);       // Double
        printValue("Hello!");   // String
    }
}

