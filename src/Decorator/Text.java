package Decorator;

/**
 * Created by Anton on 21.03.2018.
 */
public class Text implements Element {
    @Override
    public void draw() {
        System.out.println("drawing text...");
    }
}
