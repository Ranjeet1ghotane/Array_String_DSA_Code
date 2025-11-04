import java.util.Arrays;

public class MoveZeroToEnd1 {
    public void moveZeroToEnd(int[] nums){
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }

    }
    public static void main(String[] args) {
        int []nums ={0,1,0,2,4,0,5,0,1};
        MoveZeroToEnd1 mv = new MoveZeroToEnd1();
        mv.moveZeroToEnd(nums);
        System.out.println(Arrays.toString(nums));

    }
}
