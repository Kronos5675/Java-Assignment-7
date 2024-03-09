public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Calculator Menu:");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Sum of Array");
                System.out.println("6. Variance of Array");
                System.out.println("7. Standard Deviation of Array");
                System.out.println("8. Exit");
                int choice = UserInput.getIntInput("Enter your choice: ");

                if (choice == 8) {
                    System.out.println("Exiting...");
                    UserInput.closeScanner();
                    break;
                }

                if (choice >= 1 && choice <= 4) {
                    double num1 = UserInput.getDoubleInput("Enter first number: ");
                    double num2 = UserInput.getDoubleInput("Enter second number: ");
                    switch (choice) {
                        case 1:
                            System.out.println("Result: " + Calculator.add(num1, num2));
                            break;
                        case 2:
                            System.out.println("Result: " + Calculator.subtract(num1, num2));
                            break;
                        case 3:
                            System.out.println("Result: " + Calculator.multiply(num1, num2));
                            break;
                        case 4:
                            System.out.println("Result: " + Calculator.divide(num1, num2));
                            break;
                    }
                } else if (choice >= 5 && choice <= 7) {
                    int size = UserInput.getIntInput("Enter the size of the array: ");
                    double[] array = new double[size];
                    for (int i = 0; i < size; i++) {
                        array[i] = UserInput.getDoubleInput("Enter element " + (i + 1) + ": ");
                    }
                    switch (choice) {
                        case 5:
                            System.out.println("Sum of Array: " + Calculator.sum(array));
                            break;
                        case 6:
                            System.out.println("Variance of Array: " + Calculator.variance(array));
                            break;
                        case 7:
                            System.out.println("Standard Deviation of Array: " + Calculator.standardDeviation(array));
                            break;
                    }
                } else {
                    System.out.println("Invalid choice! Please enter a number between 1 and 8.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
