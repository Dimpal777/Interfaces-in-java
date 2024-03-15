// First interface
interface Interface1 {
    void commonMethod();
}

// Second interface with the same method signature
interface Interface2 {
    void commonMethod();
}

// Implement both interfaces in one class
class MyClass implements Interface1, Interface2 {
    @Override
    public void commonMethod() {
        System.out.println("Method implementation from MyClass");
    }
}

public class MainInterface {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Call the commonMethod
        obj.commonMethod();
    }
}
