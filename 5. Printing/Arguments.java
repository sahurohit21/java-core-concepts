public class Arguments {
    public static void main(String[] args) {
        int a = 10;
        float b = 2.529f;
        String str = "Rohit";

        System.out.printf("%1$d %1$d %1$d \n", a);
        System.out.printf("%1$d %2$f %1$d \n", a, b);
        System.out.printf("%3$s %2$f %1$d \n", a, b, str);

        // Integers

        System.out.printf("%5d \n", a); // Width
        System.out.printf("%05d \n", a); // Width_with_zeroes

        // Floating_Point

        System.out.printf("%8.2f \n", b);
        System.out.printf("%08.2f \n", b);

        // Strings

        System.out.printf("%18s \n", str);
        System.out.printf("%-18s", str);
    }

}
