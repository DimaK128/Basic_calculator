import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        boolean continueCalculation = true;

        System.out.println("Welcome to the Basic Calculator!");

        while (continueCalculation) {
            double operand1 = getUserDouble("Enter the first number: ");
            char operation = getOperation();
            double operand2 = getUserDouble("Enter the second number: ");

            switch (operation) {
                case '+':
                    result = add(operand1, operand2);
                    break;
                case '-':
                    result = subtract(operand1, operand2);
                    break;
                case '*':
                    result = multiply(operand1, operand2);
                    break;
                case '/':
                    if (operand2 != 0) {
                        result = divide(operand1, operand2);
                    } else {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    continue;
            }

            System.out.printf("Result: %.2f%n", result);
            continueCalculation = shouldContinue();
        }

        System.out.println("Goodbye! :)");
    }

    public static double getUserDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static boolean shouldContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to continue Yes or No? ");
        String choice = scanner.next().toLowerCase();
        return choice.equals("y");
    }
}