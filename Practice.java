import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] segments = new int[N][2];
        for (int i = 0; i < N; i++) {
            segments[i][0] = sc.nextInt(); // L
            segments[i][1] = sc.nextInt(); // R
        }

        int X = sc.nextInt();
        int Y = sc.nextInt();

        long sum = 0;

        // For every point between X and Y
        for (int point = X; point <= Y; point++) {
            int count = 0;

            // Count how many segments cover this point
            for (int i = 0; i < N; i++) {
                if (segments[i][0] <= point && segments[i][1] <= point) {
                    count++;
                }
            }
            sum += count;
        }
        System.out.println();
        System.out.println("Sum is "+sum);
    }
}
