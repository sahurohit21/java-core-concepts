import java.util.*;

public class Practice_Reversing_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int rem, rev = 0;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println("Reversed number : " + rev);

    }

}
