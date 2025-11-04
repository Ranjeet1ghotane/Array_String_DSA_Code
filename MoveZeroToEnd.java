import java.util.Arrays;

public class MoveZeroToEnd {
    
    int[] res;
    int index = 0;  

    public int[] moveZeroToEnd(int[] nums) {
        res= new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                res[index] = nums[i];
                index++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {15,78,0,45,0,78,98};
        MoveZeroToEnd move = new MoveZeroToEnd();
        move.moveZeroToEnd(nums);
        System.out.println(Arrays.toString(move.res));
    }
}
