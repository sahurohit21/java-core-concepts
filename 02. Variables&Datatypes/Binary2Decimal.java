import java.lang.*;
import java.util.*;

public class Binary2Decimal {
      public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            s.useRadix(2);
            System.out.println("Enter:");
            int x = s.nextInt();
            System.out.println(x);
      }
}