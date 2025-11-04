class Solution {
    public void rotate(int[] nums,int k) {
        int n = nums.length;
        k = k % n;
        int[] arr = new int[k];

        // copy last k elements of nums into arr
        for (int i = 0; i < k; i++) {
            arr[i] = nums[n - k + i];
        }

        // Shift remaining elements into right side
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // copy arr elements into nums at starting
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }

    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        int k = 3;
        Solution solution = new Solution();
        solution.rotate(nums, k);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
         
    }
}

