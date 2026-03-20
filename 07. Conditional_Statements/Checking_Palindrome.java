import java.util.*;

public class Checking_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int m = n;
        int rem, rev = 0;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;

        }
        if (m == rev) {
            System.out.println("Given number is palindrome.");
        } else {
            System.out.println("Given number is not palindrome.");
        }
    }

}
