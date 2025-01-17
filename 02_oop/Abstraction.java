abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Concrete method (with body)
    void sleep() {
        System.out.println("Sleeping....");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Barkss");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Animal mynewDog = new Dog();
        mynewDog.sound();
        mynewDog.sleep();
    }
}
