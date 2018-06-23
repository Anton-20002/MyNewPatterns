package Builder;

/**
 * Created by Anton on 20.03.2018.
 */
public class Ford extends CarBuilder{
    public Ford() { super(); }

    @Override
    void setColour() {
        c.setColour("Red");
    }

    @Override
    void setSpeed() {
        c.setSpeed(185);
    }
}
