import java.util.*;

public class Checking_Radix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.println("Enter a number : ");
        num = sc.nextLine();
        if (num.matches("[0-1]+")) {
            System.out.println("Radix = 2");
        } else if (num.matches("[0-7]+")) {
            System.out.println("Radix = 8");
        } else if (num.matches("[0-9A-F]+")) {
            System.out.println("Radix = 16");
        } else {
            System.out.println("Not a number");
        }

    }

}
