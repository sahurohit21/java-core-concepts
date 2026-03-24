class Student {
    public int rollno;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public double avg() {
        return (double) total() / 3;
    }

    public char grades() {
        if (avg() > 60)
            return 'A';
        else
            return 'B';
    }

}

public class StudentTest {
    public static void main(String[] args) {

        Student s = new Student();

        s.rollno = 221123;
        s.name = "Rohit Sahu";
        s.course = "IT";
        s.m1 = 90;
        s.m2 = 92;
        s.m3 = 95;

        System.out.println("Total : " + s.total());
        System.out.println("Average : " + s.avg());
        System.out.println("Grades : " + s.grades());
    }
}