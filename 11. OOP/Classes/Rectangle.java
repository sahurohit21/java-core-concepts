package Classes;
class RectangleTest {
    int length;
    int breadth;

    int Area() {
        return length * breadth;
    }
}
public class Rectangle{
    public static void main(String[] args){
        RectangleTest r = new RectangleTest();
        r.length = 30;
        r.breadth = 20;
        int area = r.Area();
        System.out.println("Area of Rectangle is "+area);
    }
}
