package Inheritance;

class Parent{
    Parent(){
        System.out.println("Non-Param of Parent");
    }
    Parent(int a){
        System.out.println("Param of Parent "+a);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Non-Param of Child");
    }
    Child(int a){
        System.out.println("Param of Child");
    }
    Child(int a, int b){
        super(a);
        System.out.println("Two Param of Child "+b);
    }
}

public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        Child c =new Child(10,20);


    }
}
