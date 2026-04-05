package Abstraction;

abstract  class Super{
    public Super(){
        System.out.println("Super Constructor");
    }
    public void meth1(){
        System.out.println("Method 1 of Super");
    }
    abstract void meth2();
}

class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Method 2 of Sub");
    }

}

public class AbstractClass {
    public static void main(String[] args){
        Super s = new Sub();
        s.meth1();
        s.meth2();

    }
}
