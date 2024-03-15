// First interface
interface Animal {
    void eat();
    void sleep();
}

// Second interface extending the first interface
interface Pet extends Animal {
    void play();
}

// Concrete class implementing the second interface
class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}

public class OtherInhert {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.play();
    }
}
