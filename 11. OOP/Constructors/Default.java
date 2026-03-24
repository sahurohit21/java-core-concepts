package Constructors;

class DefaultTest {
    int id;
    String name;

    // Default constructor
    public DefaultTest() {
        id = 101;
        name = "Rohit";
    }
}

public class Default {
    public static void main(String[] args) {
        DefaultTest d = new DefaultTest();

        System.out.println(d.id);   // 101
        System.out.println(d.name); // Rohit
    }
}

