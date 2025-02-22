class Calculator {
    // Method to add two integers
    int calculate(int a, int b) {
        return a + b;
    }

    // Method to multiply two doubles
    double calculate(double a, double b) {
        return a * b;
    }

    // Method to perform addition or subtraction based on the operation character
    int calculate(int a, int b, char operation) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}

public class Calcu {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Testing integer addition
        System.out.println("5 + 10 = " + calc.calculate(5, 10));

        // Testing double multiplication
        System.out.println("5.5 * 2.5 = " + calc.calculate(5.5, 2.5));

        // Testing operation-based calculation (addition)
        System.out.println("7 + 3 = " + calc.calculate(7, 3, '+'));

        // Testing operation-based calculation (subtraction)
        System.out.println("7 - 3 = " + calc.calculate(7, 3, '-'));

        // Uncomment the following line to see the exception for invalid operation
        // System.out.println(calc.calculate(7, 3, '*'));
    }
}


    