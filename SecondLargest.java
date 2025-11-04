import java.util.Arrays;

public class SecondLargest {
    public static int secondLargest(int[] num) {
        Arrays.sort(num);
        int max = num[num.length-1];

        for(int i = num.length-2; i >= 0; i--){
            if(num[i] < max){
                return num[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] num = {8, 8, 7, 6, 5};
        SecondLargest sd = new SecondLargest();
        int res =sd.secondLargest(num);
        System.out.println(res);

       

        // int[] nums2 = {10, 10, 10};
        // System.out.println(secondLargest(nums2)); // Output: -1
    }
}
