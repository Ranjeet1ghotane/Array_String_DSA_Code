public class Panagram {
    public void isPanagram(String str) {

        str = str.toLowerCase().replaceAll(" ", "");
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (res.indexOf(ch) == -1) {
                    res = res + ch;
                }
            }
        }

        if (res.length() == 26) {
            System.out.println("The given String is Panagram");
        } else {
            System.out.println("Not panagram");
        }   
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        Panagram pm = new Panagram();
        pm.isPanagram(str);

    }
}
