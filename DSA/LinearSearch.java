public class LinearSearch {
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 89, 8, 42, 5, 7, 1, 4, 7, 1 };
        int target = 5;

        LinearSearch li = new LinearSearch();
        int res = li.linearSearch(arr, target);
        System.out.println(res);

    }
}