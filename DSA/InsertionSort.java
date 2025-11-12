import java.util.Arrays;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        /*
         * in insertion sort i start form 2nd element of array and i element is key
         * element
         * and j start form 1st emement of array
         */
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 7, 6, 1, 2, 5, 7 };
        InsertionSort ir = new InsertionSort();
        int[] res = ir.insertionSort(arr);
        System.out.println(Arrays.toString(res));

    }
}
