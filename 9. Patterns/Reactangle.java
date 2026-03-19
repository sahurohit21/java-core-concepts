import java.util.*;

public class Reactangle {
    public static void main(String[] args) {
        int i, j, row, col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        row = sc.nextInt();
        System.out.print("Enter the number of coulmns : ");
        col = sc.nextInt();
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
