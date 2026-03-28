package Inheritance;

class Rectangle{

    int length, breadth;
    Rectangle(){
        length = breadth = 1;
    }
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle {

    int height;
    Cuboid(){
        height = 1;
    }
    Cuboid(int h){
        height = h;
    }
    Cuboid(int l, int b, int h){
        super(l,b);
        height = h;
    }
    int volume(){
        return length*breadth*height;
    }
}

public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid();
        System.out.println(c1.volume());
        Cuboid c2 = new Cuboid(10);
        System.out.println(c2.volume());
        Cuboid c3 = new Cuboid(3,5,10);
        System.out.println(c3.volume());


    }
}
