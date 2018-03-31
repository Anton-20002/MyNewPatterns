package Decorator;

/**
 * Created by Anton on 21.03.2018.
 */
public class Client {
    public static void main(String[] args) {
        Element e = new BorderDecorator(new ColourDecorator(new Window()));
        e.draw();
    }
}
