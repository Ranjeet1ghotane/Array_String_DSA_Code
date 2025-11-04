public class NumberThatAppearsOnce {
    public static int findSingle(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return nums[i]; // return immediately when unique found
            }
        }
        return -1; // should not happen if input is valid
    }

    public static void main(String[] args) {
        int[] arr = { 2,3,2 };
        System.out.println("The number that appears once is: " + findSingle(arr));
    }
}
