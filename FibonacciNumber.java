public class FibonacciNumber {
    public void fibonacciNumber() {
        int first = 0;
        int second = 1;
        int sum;

        System.out.println(first);
        System.out.println(second);

        while (true) {
            sum = first + second;
            if (sum > 100) {
                break;
            }
            first = second;
            second = sum;

            System.out.println(sum);
        }

    }

    public static void main(String[] args) {
        FibonacciNumber fb = new FibonacciNumber();
        fb.fibonacciNumber();

    }
}
