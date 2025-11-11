public class FirstCharWhichNotReapet {
    public char firstChar( String str){
        
        char ch2 = '0';
        for(int i = 0; i < str.length(); i++){
            char ch1 = str.charAt(i);
            for(int j = i+1; j < str.length(); j++){
                if(ch1 == str.charAt(j)){
                    return ch1;
                }
            }
        }
        return ch2;
       
    }
    public static void main(String[] args) {
        String str = "Ranjeet";
        FirstCharWhichNotReapet fs = new FirstCharWhichNotReapet();
       char ch = fs.firstChar(str);
       System.out.println(ch);
    }
}
