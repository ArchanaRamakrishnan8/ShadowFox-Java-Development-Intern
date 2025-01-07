import java.util.Scanner;

public class ConsoleBasedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        System.out.println("Welcome to the Advanced Calculator!");

        while (continueProgram) {
            // Display main menu
            System.out.println("\nChoose a category:");
            System.out.println("1. Basic Arithmetic Operations");
            System.out.println("2. Scientific Calculations");
            System.out.println("3. Unit Conversions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performArithmeticOperations(scanner);
                    break;
                case 2:
                    performScientificCalculations(scanner);
                    break;
                case 3:
                    performUnitConversions(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Basic Arithmetic Operations
    public static void performArithmeticOperations(Scanner scanner) {
        System.out.println("\nBasic Arithmetic Operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Scientific Calculations
    public static void performScientificCalculations(Scanner scanner) {
        System.out.println("\nScientific Calculations:");
        System.out.println("1. Square Root");
        System.out.println("2. Exponentiation");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the number: ");
                double number = scanner.nextDouble();
                if (number >= 0) {
                    System.out.println("Square Root: " + Math.sqrt(number));
                } else {
                    System.out.println("Error: Square root of negative number is not defined.");
                }
                break;
            case 2:
                System.out.print("Enter the base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the exponent: ");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + Math.pow(base, exponent));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Unit Conversions
    public static void performUnitConversions(Scanner scanner) {
        System.out.println("\nUnit Conversions:");
        System.out.println("1. Temperature Conversion (Celsius to Fahrenheit)");
        System.out.println("2. Currency Conversion (USD to EUR)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Enter amount in USD: ");
                double usd = scanner.nextDouble();
                double exchangeRate = 0.85; // Example exchange rate
                double eur = usd * exchangeRate;
                System.out.println("Amount in EUR: " + eur);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
