package Decorator;

/**
 * Created by Anton on 21.03.2018.
 */
public class ColourDecorator extends Decorator {
    public ColourDecorator(Element e) {
        super(e);
    }

    @Override
    void afterDraw() {
        System.out.println("colour drawing...");
    }
}
