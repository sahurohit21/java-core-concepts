package Inheritance;

class Super {
    public void display(){
        System.out.println("Super Class");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("Sub Class");
    }
}

public class overriding{
    public static void main(String[] args){
        Super s = new Sub();   // Dynamic Method Dispatch
        s.display();
    }
}
