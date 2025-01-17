public class Class_Object {

    // Fields
    String model;
    int year;

    // Constructor
    public Class_Object(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method
    public void displayDetails() {
        System.out.println("Model-name : " + model + "\nYear : " + year);
    }

    public static void main(String[] args) {

        // Object-Oriented Programming

        // Creating an OBJECT of Car
        Class_Object car = new Class_Object("mustang", 1900);
        car.displayDetails();

    }
}
