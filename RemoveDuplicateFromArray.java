public class RemoveDuplicateFromArray {
    public int removeDuplicate(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 1; // first element is unique
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,5,5,6,6};
        RemoveDuplicateFromArray rm = new RemoveDuplicateFromArray();
        int result = rm.removeDuplicate(nums);
        System.out.println("Unique count = " + result);
    }
}
