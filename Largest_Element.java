class Largest_Element {
    public int largestElement(int[] nums) {

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[] nums = { 10, 4, 15, 1, 41, 5 };
        Largest_Element sol = new Largest_Element();
        int res = sol.largestElement(nums);
        System.out.println(res);
    }
}
