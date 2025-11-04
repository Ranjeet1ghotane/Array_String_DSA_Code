import java.util.Scanner;

public class Palindrom_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();

        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            number = number / 10;
        }

        if (originalNumber == reverse) {
            System.out.println("The number " + originalNumber + " is palindrom number");
        } else {
            System.out.println("The Number " + originalNumber + " Is not a palindrom number");
        }

    }
}