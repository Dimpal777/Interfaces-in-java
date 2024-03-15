// Define the interface
interface MyInterface {
    void method1();
    void method2();
}

// Implement only one method from the interface
class MyClass implements MyInterface {
    @Override
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 implementation");
    }
}

public class mainn {
    public static void main(String[] args) {
        // Create an instance of MyClass through MyInterface reference
        MyInterface obj = new MyClass();

        // Call the implemented methods using the interface reference
        obj.method1();
        obj.method2();
    }
}
