class Rectangle {
    public double l;
    public double b;

    public double Area() {
        return l * b;
    }

    public double Perimeter() {
        return 2 * (l + b);
    }

    public boolean isSquare() {
        if (l == b)
            return true;
        else
            return false;
    }
}

public class RectangleTest {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        r.l = 5.3;
        r.b = 3.5;
        System.out.println("Area is : " + r.Area());
        System.out.println("Perimeter is : " + r.Perimeter());
        System.out.println("Is it a square : " + r.isSquare());
    }
}