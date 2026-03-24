package Data_Hiding;

class StudentTest {
    private String name;
    private int age;
    // Setter Method
    public void setName(String  n){
        name =n;
    }
    public void setAge(int a) {
        if (a > 0) {
            age = a;
        }
    }
    // Getter Method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Student{
    public static void main(String args[]){
        StudentTest s = new StudentTest();
        s.setName("Rohit Sahu");
        s.setAge(21);
        System.out.println("Name is "+s.getName());
        System.out.println("Age is  "+s.getAge());
    }
}
