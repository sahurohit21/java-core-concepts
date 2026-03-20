import java.util.*;

public class Practice_grades {
    public static void main(String[] args) {
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        float avg = (m1 + m2 + m3) / 3;
        if (avg >= 70) {
            System.out.println("A grade");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("B grade");
        } else {
            System.out.println("C grade");
        }

    }

}
