public class CountTheIntegerInString {
    public int returnIntegerCount(String str){

        int count = 0;
        //Method 1
           //return str.replaceAll("[^0-9]", "").length(); 

        //Method 2
        for(int i=0; i<str.length()-1; i++){
            if(Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        return  count;

    }
    public static void main(String[] args) {
       String str = "Ranjeet01Gho00013tane";
        CountTheIntegerInString rtn = new CountTheIntegerInString();
        int res = rtn.returnIntegerCount(str);
        System.out.println("Count is "+res);
    }
}
