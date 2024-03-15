
interface MyInterface {
    void myMethod();
}

// Implement the interface in a class
class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementing myMethod in MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myClass = new MyClass();

        // Call the method implemented
        myClass.myMethod();
    }
}
