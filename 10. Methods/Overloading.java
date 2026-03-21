public class Overloading {

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static float max(float a, float b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
    }

    public static void main(String args[]) {
        System.out.print(max(3, 7, 5));
    }
}
