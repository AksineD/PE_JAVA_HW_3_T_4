import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        num1 = getValidInteger(scanner, "Enter the first number: ", 0, Integer.MAX_VALUE);
        num1 = getValidInteger(scanner, "Enter the second number: ", 0, Integer.MAX_VALUE);
        num1 = getValidInteger(scanner, "Enter the theard number: ", 0, Integer.MAX_VALUE);


    }

    /**
     * Reads an integer from the user and verifies that it is within the acceptable range.
     *
     * @param scanner   Scanner object for reading input
     * @param prompt    Text to display to the user
     * @param minValue  Minimum allowed value
     * @param maxValue  Maximum allowed value
     * @return          A valid integer within the specified range
     */
    private static int getValidInteger(Scanner scanner, String prompt, int minValue, int maxValue) {
        int value;
        while (true) {
            System.out.print(prompt);
            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer
                // Check if the value is within the valid range
                if (value >= minValue && value <= maxValue) {
                    return value;
                } else {
                    System.out.println("The value must be between " + minValue + " and " + maxValue + ".");
                }
            } else {
                // If the user input is not an integer
                System.out.println("Please enter a valid integer.");
                scanner.nextLine(); // Clear the buffer
            }
        }
    }

    private static void flushScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

//        for (int i = 0; i < 50; i++) {
//            System.out.println();
//        }
    }

    private static void showMenu(Scanner scanner) {
        System.out.println("1. Find the largest number");
        System.out.println("2. Find the smallest number");
        System.out.println("3. Find the sum of the numbers");
        System.out.println("4. Find the product of the numbers");
        System.out.println("5. Exit");



    }


    private static int largestNumber(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    private static int smallestNumber(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }

    private static int sumNumber(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    private static int productNumber(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

}
