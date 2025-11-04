import java.util.ArrayList;
import java.util.Collections;

public class GCD {
    public int gcd(int a, int b) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                A.add(i);
            }
        }

        for (int i = 2; i <= b; i++) {
            if (b % i == 0) {
                B.add(i);
            }
        }

        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (A.get(i).equals(B.get(j))) {
                    res.add(A.get(i));
                }
            }
        }

        Collections.sort(res, Collections.reverseOrder());

        return res.get(0);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        GCD g = new GCD();
        int res = g.gcd(a, b);
        System.out.println("res is " + res);

    }
}
