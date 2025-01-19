public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators (+, -, *, /, %)
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // 2. Relational/Comparison Operators (>, <, >=, <=, ==, !=)
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // 3. Logical Operators (&&, ||, !)
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // 4. Bitwise Operators (&, |, ^, ~, <<, >>, >>>)
        int p = 5, q = 3; // 5 = 0101, 3 = 0011
        System.out.println("\nBitwise Operators:");
        System.out.println("p & q (AND): " + (p & q));
        System.out.println("p | q (OR): " + (p | q));
        System.out.println("p ^ q (XOR): " + (p ^ q));
        System.out.println("~p (NOT): " + (~p));
        System.out.println("p << 1 (Left shift): " + (p << 1));
        System.out.println("p >> 1 (Right shift): " + (p >> 1));
        System.out.println("p >>> 1 (Unsigned right shift): " + (p >>> 1));

        // 5. Assignment Operators (=, +=, -=, *=, /=, %=)
        int num = 10;
        System.out.println("\nAssignment Operators:");
        num += 5; // num = num + 5
        System.out.println("num += 5: " + num);
        num -= 3; // num = num - 3
        System.out.println("num -= 3: " + num);
        num *= 2; // num = num * 2
        System.out.println("num *= 2: " + num);
        num /= 4; // num = num / 4
        System.out.println("num /= 4: " + num);
        num %= 3; // num = num % 3
        System.out.println("num %= 3: " + num);

        // 6. Unary Operators (+, -, ++, --, !)
        int unary = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("Unary plus (+unary): " + (+unary));
        System.out.println("Unary minus (-unary): " + (-unary));
        System.out.println("Increment (unary++): " + (unary++)); // Post-increment
        System.out.println("Value after increment: " + unary);
        System.out.println("Decrement (--unary): " + (--unary)); // Pre-decrement

        // 7. Ternary Operator (condition ? value1 : value2)
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b: " + max);

        // 8. Instanceof Operator
        String str = "Java";
        System.out.println("\nInstanceof Operator:");
        System.out.println("str instanceof String: " + (str instanceof String));

        // 9. Type Casting
        double decimal = 9.8;
        int casted = (int) decimal; // Explicit casting
        System.out.println("\nType Casting:");
        System.out.println("Double value: " + decimal);
        System.out.println("Casted to int: " + casted);
    }
}
