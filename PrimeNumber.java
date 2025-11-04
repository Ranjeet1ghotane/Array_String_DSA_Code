public class PrimeNumber {
    public void primenumbers() {

        int count=0;
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                System.out.print("\n"+i+"\n");
                System.out.println("Total count is: "+count);
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumber pm = new PrimeNumber();
        pm.primenumbers();
    }
}
