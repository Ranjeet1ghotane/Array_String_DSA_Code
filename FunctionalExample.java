
interface Operation {
    int perform(int a, int b);
}

public class FunctionalExample {
    // method that takes another method (via functional interface)
     static int calculate(int x, int y, Operation op) {
        return op.perform(x, y);
    }

    public static void main(String[] args) {
        // Lambda expressions (methods)
        Operation add = (a, b) -> a + b;
        Operation multiply = (a, b) -> a * b;

        // Passing methods (lambdas) into another method
        System.out.println("Addition: " + calculate(10, 5, add));
        System.out.println("Multiplication: " + calculate(10, 5, multiply));

        // You can even pass inline lambdas directly
        System.out.println("Subtraction: " + calculate(10, 5, (a, b) -> a - b));
    }
}
