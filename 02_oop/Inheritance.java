
class Animal {
    void eat() {
        System.out.println("This Animal Eats Food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The DOG Barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Dog newDog = new Dog();
        newDog.eat();
        newDog.bark();

    }
}
