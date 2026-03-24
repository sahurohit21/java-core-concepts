package Classes;
class StudentTest{
    String name;
    int age;

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
public class Student{
    public static void main(String[] args){
        StudentTest s1 = new StudentTest();
        StudentTest s2 = new StudentTest();
        s1.name = "Rohit Sahu";
        s1.age = 22;
        s1.display();

        s2.name = "Nitesh Raghuwanshi";
        s2.age = 23;
        s2.display();
    }
}