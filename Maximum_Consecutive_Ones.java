public class Maximum_Consecutive_Ones {

    public int findMaxConsecutiveOnes(int[] nums){
        
        int currentCount=0;
        int maxcount=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                currentCount++;
                maxcount = Math.max(maxcount, currentCount);
            }else if(nums[i]==0){
                currentCount = 0; // Reset the count when 0 is found
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {
        int []nums = {0,0,8,0,0};
        Maximum_Consecutive_Ones max = new Maximum_Consecutive_Ones();
        int res = max.findMaxConsecutiveOnes(nums);
        System.out.println(res);
    }
}