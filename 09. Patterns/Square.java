import java.util.*;

public class Square {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
