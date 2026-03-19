import java.util.*;

public class Flipped_Triangle {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
