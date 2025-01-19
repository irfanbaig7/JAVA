public class AllLoops {
    public static void main(String[] args) {
        // 1. For Loop: Print numbers from 1 to 5
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. While Loop: Print numbers from 5 to 1
        System.out.println("\nWhile Loop:");
        int j = 5;
        while (j > 0) {
            System.out.print(j + " ");
            j--;
        }
        System.out.println();

        // 3. Do-While Loop: Print numbers from 1 to 5
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
        System.out.println();

        // 4. Nested Loops: Print a pattern (triangle)
        System.out.println("\nNested Loop - Pattern:");
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 5. Enhanced For Loop (For-each): Print elements of an array
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. Infinite Loop with Break Condition: Print numbers until 5
        System.out.println("\nInfinite Loop with Break:");
        int count = 1;
        while (true) {
            System.out.print(count + " ");
            if (count == 5) break; // Exit loop when count reaches 5
            count++;
        }
        System.out.println();

        // 7. Using Continue in a Loop: Skip number 3 in a sequence
        System.out.println("\nUsing Continue in a Loop:");
        for (int x = 1; x <= 5; x++) {
            if (x == 3) continue; // Skip the rest of this iteration
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
