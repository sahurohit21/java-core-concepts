import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter value of a : ");
        a = sc.nextInt();
        System.out.print("Enter value of b : ");
        b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Now, a = " + a + " and b = " + b);

    }
}
