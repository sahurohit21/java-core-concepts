package Inner_Classes;

class StaticOuter {
        int x = 10;
        static int y =20;

        static class Inner {
            void display() {
                System.out.println("Value of y = " + y); // NON-STATIC variables cannot be accessed by static class
            }
        }

}

public class Static_InnerClass{
    public static void main(String[] args){

        // No need to create StaticOuter object
        StaticOuter.Inner m = new StaticOuter.Inner();
        m.display();
    }
}
