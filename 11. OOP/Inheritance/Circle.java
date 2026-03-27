package Inheritance;

//Parent class
class Circle1 {
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }
}

// Child class
class Cylinder extends Circle1 {
    public double height;

    public double volume(){
        return area()*height;
    }
}

public class Circle{
    public static void main(String[] args){
        Cylinder c = new Cylinder();
        c.radius = 5;
        c.height = 8;
        System.out.println("Area of cylinder = "+c.area());
        System.out.println("Area of volume = "+c.volume());

    }
}
