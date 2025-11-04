public class practice3 {
    public int linearSearch(int[]nums,int target){

        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
               return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int [] nums = {2,33,3,5,3};
        int target = 34;

        practice3 pra = new practice3();
        int res = pra.linearSearch(nums, target);
        System.out.println(res);
    }
}
