public class Methods2 {
    public static void main(String[] args) {
        String name = new String("Rohit Sahu");

        // startsWith
        boolean b = name.startsWith("Ro");
        System.out.println(b);

        // charAt
        char c = name.charAt(3);
        System.out.println(c);

        // indexOf
        int i1 = name.indexOf("hi");
        System.out.println(i1);

        int i2 = name.lastIndexOf("h");
        System.out.println(i2);

        int i3 = name.indexOf("p");
        System.out.println(i3);

        int i4 = name.indexOf("i", 2);
        System.out.println(i4);

        int i5 = name.lastIndexOf('h', 9);
        System.out.println(i5);

    }

}
