package Constructors;
class ParameterizedTest{
    private double length;
    private double width;

    public ParameterizedTest(double length, double width){
        this.length = length;
        this.width = width;
    }
    public ParameterizedTest(double side){
        length=width=side;
    }

    public double Area(){
        return length*width;
    }
}
public class Parameterized {
    public static void main(String[] args){
        ParameterizedTest rect1= new ParameterizedTest(10,20);
        System.out.println("Area of Reactangle 1 is "+rect1.Area());
        ParameterizedTest rect2= new ParameterizedTest(20);
        System.out.println("Area of Reactangle 2 is "+rect2.Area());

    }
}
