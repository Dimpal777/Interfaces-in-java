// Public interface with fields and methods
 interface MyInterface {
    // Fields with values assigned
    int NUMBER = 42;
    String MESSAGE = "Hello from MyInterface";

    // Method declarations
    void displayMessage();
    void displayNumber();
}

// Class implementing the interface
class MyClass implements MyInterface {
    // Implementing methods from the interface
    @Override
    public void displayMessage() {
        System.out.println("Message from interface: " + MESSAGE);
    }

    @Override
    public void displayNumber() {
        System.out.println("Number from interface: " + NUMBER);
    }
}

public class MethodValue {
    public static void main(String[] args) {
        // Creating an object of the class that implements the interface
        MyClass obj = new MyClass();

        // Accessing interface fields and calling interface methods
        System.out.println("Interface field NUMBER: " + MyInterface.NUMBER);
        System.out.println("Interface field MESSAGE: " + MyInterface.MESSAGE);
        
        obj.displayMessage();
        obj.displayNumber();
    }
}