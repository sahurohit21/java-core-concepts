public class If_else_ladder {
    public If_else_ladder() {
    }

    public static void main(String[] var0) {
        byte var1 = 10;
        byte var2 = 15;
        byte var3 = 5;
        if (var1 > var2 && var1 > var3) {
            System.out.println("a is greater : " + var1);
        } else if (var2 > var3) {
            System.out.println("b is greater : " + var2);
        } else {
            System.out.println("c is greater : " + var3);
        }

    }
}
