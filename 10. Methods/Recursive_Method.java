import java.util.Scanner;

public class Recursive_Method {
    static int factorial(int m) {
        if (m == 0)
            return 1;
        return m * factorial(m - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print(factorial(n));

    }

}
