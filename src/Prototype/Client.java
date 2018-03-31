package Prototype;

/**
 * Created by Anton on 29.03.2018.
 */
public class Client {
    public static void main(String[] args) {
        StudentCreator sc = new StudentCreator();
        sc.setS(new Student(21,180,80));
        Student student = sc.getS();
        student.print();
    }
}
