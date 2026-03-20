import java.util.*;

public class Practice_Display_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long num = sc.nextLong();
        while (num > 0) {
            long rem = num % 10;
            num = num / 10;
            System.out.println(rem);

        }
    }

}
