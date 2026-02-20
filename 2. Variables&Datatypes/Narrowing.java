public class Narrowing {

    public static void main(String[] args) {
        int i = 10;
        byte b = 5;
        short s = 120;
        long l = 10;
        float f = 10.5f;
        double d = 50;
        char c = 10;

        b = (byte) s;
        f = i;
        i = (int) f;
        f = (float) d;
        System.out.println(b);
        System.out.println(f);
        System.out.println(i);
        System.out.println(f);

    }
}
