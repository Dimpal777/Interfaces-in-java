// First interface
interface Interface1 {
    void method1();
}

// Second interface
interface Interface2 {
    void method2();
}

// Implement both interfaces in one class
class MyClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 implementation");
    }
}

public class interfacemain {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Call the methods implemented from both interfaces
        obj.method1();
        obj.method2();
    }
}