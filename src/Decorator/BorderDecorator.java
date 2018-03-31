package Decorator;

/**
 * Created by Anton on 21.03.2018.
 */
public class BorderDecorator extends Decorator{
    public BorderDecorator(Element element) {
        super(element);
    }

    @Override
    void afterDraw() {
        System.out.println("draw border...");
    }
}
