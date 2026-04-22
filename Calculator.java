public class Calculator {

    

    

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        
        
        System.out.println(calc.multiply(15, 5));
        System.out.println(calc.divide(10, 5));
    }
}
