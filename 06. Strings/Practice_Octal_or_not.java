public class Practice_Octal_or_not {
    public static void main(String[] args) {
        String s1 = "268A79";
        System.out.println(s1.matches("[0-9A-F]+"));
        String s2 = "268A7W";
        System.out.println(s2.matches("[0-9A-F]+"));

    }

}