import java.util.*;

public class Area_of_triangle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float base, height, area;
        System.out.print("Enter base : ");
        base = s.nextFloat();
        System.out.print("Enter height : ");
        height = s.nextFloat();
        area = 1f / 2f * base * height; // As 1&2 are integers by default
        System.out.println("Area of triangle is : " + area);

    }

}
