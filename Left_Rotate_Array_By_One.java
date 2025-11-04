import java.util.Arrays;

public class Left_Rotate_Array_By_One {
    public int[] rotateArrayByOne(int[] nums) {

        int firstElement;
        firstElement = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = firstElement;
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 45, 78 };
        Left_Rotate_Array_By_One l = new Left_Rotate_Array_By_One();
        int res[] = l.rotateArrayByOne(nums);
        System.out.println(Arrays.toString(res));
    }
}
