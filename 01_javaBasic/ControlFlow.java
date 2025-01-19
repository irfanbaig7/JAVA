public class ControlFlow {
    public static void main(String[] args) {
        // 1. If-Else Statement
        int age = 20;
        System.out.println("If-Else Statement:");
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // 2. If-Else-If Ladder
        int marks = 85;
        System.out.println("\nIf-Else-If Ladder:");
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // 3. Switch Statement
        int day = 3;
        System.out.println("\nSwitch Statement:");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        // 9. Return Statement
        System.out.println("\nReturn Statement:");
        printMessage(0);
    }

    // Method to demonstrate return statement
    public static void printMessage(int value) {
        if (value == 0) {
            System.out.println("Value is zero, exiting method.");
            return; // Exit the method
        }
        System.out.println("Value is: " + value);
    }
}
