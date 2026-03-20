public class RegularExp {
    public static void main(String[] args) {
        String s1 = "abcb04b";
        String s2 = "";
        String s3 = "rgd";

        // *
        System.out.println(s1.matches(".*"));
        System.out.println(s1.matches("[a-z]*"));

        // +
        System.out.println(s2.matches("[a-z]+"));

        // {3}
        System.out.println(s3.matches("[a-z]{3}"));
        System.out.println(s3.matches("[a-z]{1,8}"));

    }

}
