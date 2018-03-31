package Decorator;

/**
 * Created by Anton on 21.03.2018.
 */
public abstract class Decorator implements Element {
    Element e;

    public Decorator(Element e) {
        this.e = e;
    }
    abstract void afterDraw();

    @Override
    public void draw() {
        e.draw();
        afterDraw();
    }
}
