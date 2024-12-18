import addition.Addition;
import division.Division;
import multiplication.Multiplication;
import subtraction.Subtraction;

public class ArithmeticOperations {

    // Method to perform addition
    public double performAddition(double a, double b) {
        return Addition.add(a, b);
    }

    // Method to perform subtraction
    public double performSubtraction(double a, double b) {
        return Subtraction.subtract(a, b);
    }

    // Method to perform multiplication
    public double performMultiplication(double a, double b) {
        return Multiplication.multiply(a, b);
    }

    // Method to perform division
    public double performDivision(double a, double b) {
        return Division.divide(a, b);
    }

    // Test the arithmetic operations
    public static void main(String[] args) {
        ArithmeticOperations operations = new ArithmeticOperations();

        double a = 10;
        double b = 5;

        System.out.println("Addition of " + a + " and " + b + " = " + operations.performAddition(a, b));
        System.out.println("Subtraction of " + a + " and " + b + " = " + operations.performSubtraction(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " = " + operations.performMultiplication(a, b));
        System.out.println("Division of " + a + " and " + b + " = " + operations.performDivision(a, b));
    }
}
