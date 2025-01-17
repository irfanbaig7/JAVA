
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        if (age >= 18 && age <= 21) {
            System.out.println("You are an ADULT");
        } else if (age >= 22) {
            System.out.println("You are an MATURE/MEN");
        } else {
            System.out.println("You are a TEENAGER/CHILD");
        }

        // Switch CASES

        System.out.print("Enter the day bertween 1 to 3 : ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other Day");

        }

        sc.close();
    }
}
