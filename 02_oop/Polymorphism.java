
class Calculator {

    // Overloading: Same method name, different parameters.
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Overriding
    public void display() {
        System.out.println("Calculator Display !");
    }

}

class sciCalculator extends Calculator {

    public void display() {
        System.out.println("Scientific Calculator Display");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Method Overloading and Overriding

        Calculator calc = new Calculator();
        System.out.println("Sum of integers : " + calc.add(10, 20));
        System.out.println("Sum of doubles : " + calc.add(5.5, 3.5));
        // calc.display();

        sciCalculator sciCalc = new sciCalculator();
        sciCalc.display();

    }
}
