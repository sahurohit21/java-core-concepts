import java.util.Scanner;

public class KeyboardInput {
      public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter two numbers :");
            float x = s.nextFloat();
            float y = s.nextFloat();
            float z = x + y;
            System.out.println("Sum is " + z);
      }
}
