public class Basic {
    public static void main(String[] args) {
        String name = "Rohit"; // Stored in pool
        String str1 = new String("JAVA"); // Created in heap
        System.out.println(name);
        System.out.println(str1);

        // Using char array

        char c[] = { 'A', 'B', 'C', 'D' };
        String str2 = new String(c);
        System.out.println("Using character array : " + str2);

        // Using byte array

        byte b[] = { 65, 66, 67, 68 };
        String str3 = new String(b);
        System.out.println("Using byte array : " + str3);

        // Using string

        String str = new String("JAVA");
        System.out.println("Using string method : " + str);

    }

}
