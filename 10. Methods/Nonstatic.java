public class Nonstatic {
    int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String args[]) {
        int a = 10, b = 15, c;
        Nonstatic ns = new Nonstatic();
        c = ns.max(a, b);
        System.out.print("Maximum of a & b is " + c);

    }

}
