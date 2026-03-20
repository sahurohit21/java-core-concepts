public class Methods3 {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "PYTHON";
        String s3 = "JAVA";
        String s4 = "jAVA";

        // equals
        boolean b1 = s1.equals(s2);
        boolean b2 = s1.equals(s3);
        System.out.println(b1);
        System.out.println(b2);

        // compareto
        int i = s1.compareTo(s4);
        System.out.println(i);

        // concat
        String s5 = s1.concat(s2);
        System.out.println(s5);
        System.out.println(s1 + s2);

    }

}
