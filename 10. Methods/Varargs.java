public class Varargs {
    static void show(int... A) {
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        show();
        show(10, 20, 30);
        show(new int[] { 2, 5, 19, 11, 0, 31 }); // Anonymous Array
    }

}
