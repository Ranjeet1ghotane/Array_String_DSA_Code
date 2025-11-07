import java.util.Arrays;

public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == target) {
                return middle;
            }
            else if (arr[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = { 4, 8, 4, 5, 2, 1, 4, 7 };
         Arrays.sort(arr);
        int target = 5;
        BinarySearch bi = new BinarySearch();
        int res = bi.binarySearch(arr, target);
        System.out.println(res);
    }
}
