package Singleton;

/**
 * Created by Anton on 29.03.2018.
 */
public class TestSingleton {
    private TestSingleton() {
    }

    ;
    public static TestSingleton myOne;

    public static TestSingleton getSingleton() {
        if (myOne == null) {
            myOne = new TestSingleton();
        }
    return myOne;
    }

    void print() {
        System.out.println(this);
    }
}
