package Inner_Classes;

//Interface Based Example
interface Test {
    void show();
}

public class Anonymous_innerClass {
    public static void main(String[] args) {

        Test t = new Test() {
            public void show() {
                System.out.println("Hello");
            }
        };

        t.show();
    }
}
