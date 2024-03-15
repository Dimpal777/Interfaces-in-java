// Define the interface with a default method
interface MyInterface {
    // Default method
    default void defaultMethod() {
        System.out.println("Default method implementation in interface");
    }
}

// Implement the interface in a class
class MyClass implements MyInterface {
    // No need to provide implementation for defaultMethod() here
}

public class defaultMain {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Call the default method
        obj.defaultMethod();
    }
}
