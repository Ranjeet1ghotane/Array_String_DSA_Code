public class ReverseString {
    public String reverseString(String str){
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){
            rev = rev+str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String str = "Hello";
       ReverseString sv = new ReverseString();
       
       String result = sv.reverseString(str);
       System.out.println("Original "+str);
       System.out.println("Reverse "+result);
    }
}
