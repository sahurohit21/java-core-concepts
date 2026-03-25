package Classes;

class Array_of_ObjectsTest {
    String name;
    int age;
}

public class Array_of_Objects {
    public static void main(String[] args) {

        Array_of_ObjectsTest[] students = new Array_of_ObjectsTest[2];

        students[0] = new Array_of_ObjectsTest();
        students[1] = new Array_of_ObjectsTest();

        students[0].name = "Rohit";
        students[0].age = 21;

        students[1].name = "Aman";
        students[1].age = 22;

        for (Array_of_ObjectsTest s : students) {
            System.out.println(s.name + " " + s.age);
        }
    }
}