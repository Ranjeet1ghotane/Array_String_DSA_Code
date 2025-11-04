
import java.util.Arrays;

public class ConvertStrToArray {
    public char[] convertStringToArray(String str){
        char [] arr = str.toCharArray(); 
        for(int i = 0; i <= arr.length-1; i++){
            System.out.println(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        String str = "Hello";
        ConvertStrToArray st = new ConvertStrToArray();
        char [] res = st.convertStringToArray(str);
        System.out.print(Arrays.toString(res));
    }
}
