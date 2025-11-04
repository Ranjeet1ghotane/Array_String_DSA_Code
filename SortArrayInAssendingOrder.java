import java.util.Arrays;

public class SortArrayInAssendingOrder {
    public int[] sortArray(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {2, 0, 1, 2, 1, 0, 0, 2};
        SortArrayInAssendingOrder sre = new SortArrayInAssendingOrder();
        int[] res =sre.sortArray(arr);
        System.out.println(Arrays.toString(res));
    }
}
