import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, choice;

        num1 = getValidInteger(scanner, "Enter the first number: ", 0, Integer.MAX_VALUE);
        num2 = getValidInteger(scanner, "Enter the second number: ", 0, Integer.MAX_VALUE);
        num3 = getValidInteger(scanner, "Enter the theard number: ", 0, Integer.MAX_VALUE);

        choice = showMenu(scanner);
        processAndDisplayResults(num1, num2, num3, choice);
        scanner.close();
    }

    /**
     * Processes the user's choice and performs the corresponding operation
     * (e.g., finding the largest or smallest number, calculating the sum or product).
     * Displays the result of the selected operation.
     *
     * @param num1   The first number
     * @param num2   The second number
     * @param num3   The third number
     * @param choice The user's menu selection
     */
    private static void processAndDisplayResults(int num1, int num2, int num3, int choice) {
        if (choice == 1) {
            System.out.println("The largest number is: " + largestNumber(num1, num2, num3));
        } else if (choice == 2) {
            System.out.println("The smallest number is: " + smallestNumber(num1, num2, num3));
        } else if (choice == 3) {
            System.out.println("The sum of the numbers is: " + sumNumbers(num1, num2, num3));
        } else if (choice == 4) {
            System.out.println("The product of the numbers is: " + productNumbers(num1, num2, num3));
        } else {
            System.out.println("Goodbye!");
        }
    }

    /**
     * Prompts the user to enter a valid integer within the specified range,
     * and handles errors like non-integer input or out-of-range values.
     *
     * @param scanner  Scanner object used to read user input
     * @param prompt   The input prompt message to display
     * @param minValue Minimum allowed value for the input
     * @param maxValue Maximum allowed value for the input
     * @return A valid integer entered by the user
     */
    private static int getValidInteger(Scanner scanner, String prompt, int minValue, int maxValue) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer
                if (value >= minValue && value <= maxValue) {
                    return value;
                } else {
                    System.out.println("The value must be between " + minValue + " and " + maxValue + ".");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.nextLine(); // Clear the buffer
            }
        }
    }

    /**
     * Displays the options menu and gets the user's choice as a valid integer.
     *
     * @param scanner Scanner object used to read user input
     * @return The user's menu choice as an integer
     */
    private static int showMenu(Scanner scanner) {
        System.out.println("1. Find the largest number");
        System.out.println("2. Find the smallest number");
        System.out.println("3. Find the sum of the numbers");
        System.out.println("4. Find the product of the numbers");
        System.out.println("5. Exit");

        return getValidInteger(scanner, "Enter your choice: ", 1, 5);
    }

    /**
     * Finds and returns the largest of three numbers.
     *
     * @param num1 The first number
     * @param num2 The second number
     * @param num3 The third number
     * @return The largest of the three numbers
     */

    private static int largestNumber(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    /**
     * Finds and returns the smallest of three numbers.
     *
     * @param num1 The first number
     * @param num2 The second number
     * @param num3 The third number
     * @return The smallest of the three numbers
     */

    private static int smallestNumber(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    /**
     * Calculates and returns the sum of three numbers.
     *
     * @param num1 The first number
     * @param num2 The second number
     * @param num3 The third number
     * @return The sum of the three numbers
     */

    private static int sumNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    /**
     * @param num1 The first number
     * @param num2 The second number
     * @param num3 The third number
     * @return The product of the three numbers
     */
    private static int productNumbers(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
}
