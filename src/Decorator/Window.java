package Decorator;

/**
 * Created by Anton on 21.03.2018.
 */
public class Window implements Element {
    @Override
    public void draw() {
        System.out.println("drawing window...");
    }
}
