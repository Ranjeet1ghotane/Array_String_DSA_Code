import java.util.Arrays;

public class SumOfSubArrays {
    public int[] sumOfArrays(int []num1, int []num2){
        int[] res= new int[num1.length * num2.length];
        int index = 0;
        for(int i = 0; i < num1.length; i++){
            for(int j = 0; j < num2.length; j++){
                res[index] = num1[i]+num2[j];
                index++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[]num2 = {4,5,6};
        SumOfSubArrays sm = new SumOfSubArrays();
       int[]res = sm.sumOfArrays(num1, num2);
       System.out.println(Arrays.toString(res));
    }
}
