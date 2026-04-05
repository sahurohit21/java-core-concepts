package Abstraction.Interfaces;

interface Test1{
    void meth1();
    void meth2();
}

class Test2 implements Test1{
    @Override
    public void meth1(){
        System.out.println("method 1 of Test2");
    }

    @Override
    public void meth2(){
        System.out.println("method 2 of Test2");
    }

    public void meth3(){
        System.out.println("method 3 of class Test2");
    }
}

public class Basics {
    public static void main(String[] args){
        Test1 t;
        t = new Test2();
        t.meth1();
        t.meth2();
    }
}
