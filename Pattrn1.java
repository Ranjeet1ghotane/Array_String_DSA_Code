
public class Pattrn1 {
    public int reverseNumber(int num) {
        int reverse = 0;
        

        while (num != 0) {
            int digit = num%10;
            reverse = (reverse*10)+digit;
            num = num/10;

        }
        return reverse;
    }

    public static void main(String[] args) {
        int num = 7066;
        Pattrn1 pt = new Pattrn1();
        int res = pt.reverseNumber(num);
        System.out.println(res);

    }
}
