public class MissingNumberInArray {
    public int missingNumber(int[] nums) {

        int sum = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            sum = sum + nums[i]; // 12
        }

        int sum1 = 0;
        for (int i = 1; i <= 5; i++) {
            sum1 = sum1 + i;
        }

        return sum1-sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5 };
        MissingNumberInArray ms = new MissingNumberInArray();
        int ans = ms.missingNumber(nums);
        System.out.println("The missing number is: " + ans);
    }
}
