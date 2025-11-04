import java.util.Arrays;

public class RotateElementByK {
    public int[] rotateElementByk(int[] num, int k) {
        int n = num.length;
        int[] arr = new int[n];  // new rotated array

        // Place each element at its new rotated position
        for (int i = 0; i < n; i++) {
            arr[(i + k) % n] = num[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] num = {14, 25, 78, 21, 78, 45, 74};
        int k = 3;

        RotateElementByK rt = new RotateElementByK();
        int[] res = rt.rotateElementByk(num, k);

        System.out.println(Arrays.toString(res));
    }
}
