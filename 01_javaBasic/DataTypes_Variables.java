
// A class to demonstrate default values of primitive types
class DefaultValues {
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;
}

public class DataTypes_Variables {
    public static void main(String[] args) {
        // 1. Primitive Data Types

        // Integer types
        byte byteValue = 127; // Range: -128 to 127
        short shortValue = 32000; // Range: -32,768 to 32,767
        int intValue = 2147483647; // Range: -2^31 to 2^31-1
        long longValue = 9223372036854775807L; // Range: -2^63 to 2^63-1 (L for long literals)

        System.out.println("Integer Types:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);

        // Floating-point types
        float floatValue = 3.14f; // Precision: 6-7 decimal digits (f for float literals)
        double doubleValue = 3.14159265359; // Precision: 15-16 decimal digits

        System.out.println("\nFloating-point Types:");
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        // Character type
        char charValue = 'A'; // Stores a single 16-bit Unicode character
        System.out.println("\nCharacter Type:");
        System.out.println("char: " + charValue);

        // Boolean type
        boolean booleanValue = true; // Stores true or false
        System.out.println("\nBoolean Type:");
        System.out.println("boolean: " + booleanValue);

        // 2. Non-Primitive Data Types

        // String (Sequence of characters)
        String stringValue = "Hello, Java!";
        System.out.println("\nNon-Primitive Type:");
        System.out.println("String: " + stringValue);

        // Arrays
        int[] intArray = { 1, 2, 3, 4, 5 }; // Array of integers
        System.out.println("\nArray:");
        System.out.print("intArray: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        // Default values of primitive data types
        System.out.println("\n\nDefault Values of Primitive Types:");
        DefaultValues defaultValues = new DefaultValues();
        System.out.println("byte: " + defaultValues.defaultByte);
        System.out.println("short: " + defaultValues.defaultShort);
        System.out.println("int: " + defaultValues.defaultInt);
        System.out.println("long: " + defaultValues.defaultLong);
        System.out.println("float: " + defaultValues.defaultFloat);
        System.out.println("double: " + defaultValues.defaultDouble);
        System.out.println("char: '" + defaultValues.defaultChar + "'"); // Empty character
        System.out.println("boolean: " + defaultValues.defaultBoolean);
    }
}
