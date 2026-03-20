public class Methods1 {
    public static void main(String[] arg) {
        String str = new String("Rohit Sahu");

        // length
        int l = str.length();
        System.out.println(l);

        // LowerCase
        str = str.toLowerCase();
        System.out.println(str);

        // Trimm
        String str1 = "  Welcome Home  ";
        String str2 = str1.trim();
        System.out.println(str2);

        // SubString
        String str3 = str1.substring(4, 8);
        System.out.println(str3);

        // Replace
        String str4 = "Java";
        String str5 = str4.replace('a', 'i');
        System.out.println(str4 + " " + str5);

    }

}
