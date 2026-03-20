import java.util.*;

public class Practice_arthmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu : ");
        System.out.println("ADD :");
        System.out.println("SUB :");
        System.out.println("MUL :");
        System.out.println("DIV");
        System.out.println("Enter any two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Options in words : ");
        String option = sc.nextLine();

        switch (option) {
            case "ADD":
                System.out.println("Sum is " + (n1 + n2));
                break;
            case "SUB":
                System.out.println("Difference is " + (n1 - n2));
                break;
            case "MUL":
                System.out.println("Multiplication is " + (n1 * n2));
                break;
            case "DIV":
                System.out.println("Division is " + (n1 + n2));
                break;
            default:
                System.out.println("Invalid options");
                break;
        }

    }

}
