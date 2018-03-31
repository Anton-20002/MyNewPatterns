package Prototype;

/**
 * Created by Anton on 29.03.2018.
 */
public class Student {
    int age;
    int height;
    int weight;

    public Student(int age, int height, int weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    void print() {
        System.out.println(age + " "  + height + " " + weight);
    }
}
