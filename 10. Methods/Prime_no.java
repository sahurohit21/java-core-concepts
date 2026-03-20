import java.util.Scanner;

public class Prime_no {
    static boolean isPrime(int x) {
        if (x <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if (isPrime(a))
            System.out.print(a + " is a prime number");
        else
            System.out.print(a + " is not a prime number");

    }
}
