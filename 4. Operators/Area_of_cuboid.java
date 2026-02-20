import java.util.*;

public class Area_of_cuboid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float length, breadth, height;
        double area, volume;
        System.out.print("Enter length : ");
        length = s.nextFloat();
        System.out.print("Enter breadth : ");
        height = s.nextFloat();
        System.out.print("Enter height : ");
        breadth = s.nextFloat();
        area = 2 * (length * breadth + breadth * height + length * height);
        volume = length * breadth * height;
        System.out.println("Total area of the cuboid is " + area);
        System.out.println("Volume of the cuboid is " + volume);
    }

}
