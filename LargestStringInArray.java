public class LargestStringInArray {
    public String largestString(String[] str){

        String largest = str[0];
        for(int i = 1; i < str.length; i++){
            if(str[i].length() > largest.length()){
                largest = str[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        String[] str = {"Mango","Banana","Kivi","WaterMelone"};
        LargestStringInArray lr = new LargestStringInArray();
       String largest =  lr.largestString(str);
       System.out.println(largest);
    }
}
