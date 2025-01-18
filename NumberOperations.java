import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, choice;

        num1 = getValidInteger(scanner, "Enter the first number: ", 0, Integer.MAX_VALUE);
        num2 = getValidInteger(scanner, "Enter the second number: ", 0, Integer.MAX_VALUE);
        num3 = getValidInteger(scanner, "Enter the theard number: ", 0, Integer.MAX_VALUE);

        choice = showMenu(scanner);
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
     * Displays a menu of options and gets the user's choice.
     *
     * @param scanner Scanner object for reading input
     * @return        The user's menu choice
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
     */
    private static int largestNumber(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    /**
     * Finds and returns the smallest of three numbers.
     */
    private static int smallestNumber(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    /**
     * Calculates and returns the sum of three numbers.
     */
    private static int sumNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    /**
     * Calculates and returns the product of three numbers.
     */
    private static int productNumbers(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
}
