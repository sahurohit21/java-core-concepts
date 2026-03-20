public class Practice_Binary_or_not {
    public static void main(String[] args) {
        int b1 = 1000010;
        String s1 = String.valueOf(b1);
        System.out.println(s1.matches("[01]+"));
        int b2 = 1070100;
        String s2 = String.valueOf(b2);
        System.out.println(s2.matches("[01]+"));

    }
}