public class Calculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    public static double variance(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        double mean = sum(array) / array.length;
        double variance = 0;
        for (double num : array) {
            variance += Math.pow(num - mean, 2);
        }
        return variance / array.length;
    }

    public static double standardDeviation(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        return Math.sqrt(variance(array));
    }
}
