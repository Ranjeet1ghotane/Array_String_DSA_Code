import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {

        // Bubble sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr; // Sorted array
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        BubbleSort bu = new BubbleSort();
        int[] res = bu.bubbleSort(arr);
        System.out.println(Arrays.toString(res));
    }
}
