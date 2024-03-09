import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                int input = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.nextLine(); // Consume invalid input
            }
        }
    }

    public static double getDoubleInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                double input = scanner.nextDouble();
                scanner.nextLine(); // Consume newline character
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Consume invalid input
            }
        }
    }

    public static String getStringInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static void closeScanner() {
        scanner.close();
    }
}
