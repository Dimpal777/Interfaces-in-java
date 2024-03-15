public class PVTProtected {
    // Private interface inside a class
    private interface MyPrivateInterface {
        // Fields with values assigned
        int NUMBER = 42;
        String MESSAGE = "Hello from MyPrivateInterface";

        // Method declarations
        void displayMessage();
        void displayNumber();
    }

    // Class implementing the private interface
    static class MyClass implements MyPrivateInterface {
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

    public static void main(String[] args) {
        // Creating an object of the class that implements the interface
        MyClass obj = new MyClass();

        // Accessing interface fields and calling interface methods
        System.out.println("Interface field NUMBER: " + MyPrivateInterface.NUMBER);
        System.out.println("Interface field MESSAGE: " + MyPrivateInterface.MESSAGE);

        obj.displayMessage();
        obj.displayNumber();
    }
}
