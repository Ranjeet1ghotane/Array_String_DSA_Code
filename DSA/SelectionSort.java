import java.util.Arrays;

public class SelectionSort {
    public int[] selectionsort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min_Index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_Index] > arr[j]) {
                    min_Index = j;
                }
            }

            int temp = arr[min_Index];
            arr[min_Index] = arr[i];
            arr[i] = temp;
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 8, 4, 2, 1, 7, 5, 6, 3, 2, 5 };
        SelectionSort si = new SelectionSort();
        int[] res = si.selectionsort(arr);
        System.out.println(Arrays.toString(res));
    }
}
