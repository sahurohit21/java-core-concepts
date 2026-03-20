public class Call_by_reference {
    static void change(int X[], int index, int value) {
        X[index] = value;
    }

    static void change2(int b, int value) {
        b = value;
    }

    public static void main(String args[]) {
        int A[] = { 2, 5, 9, 10, 7 };
        change(A, 2, 22);
        for (int x : A) {
            System.out.print(" " + x);
        }
        System.out.println();
        int a = 100;
        change2(a, 99);
        System.out.print(a);

    }

}
