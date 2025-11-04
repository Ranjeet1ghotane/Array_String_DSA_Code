import java.util.ArrayList;

public class IsSorted {
    public boolean isSorted(ArrayList<Integer> nums) {

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4445);
        nums.add(500);

        IsSorted sorted = new IsSorted();
        boolean res = sorted.isSorted(nums);
        System.out.println(res);
    }
}
