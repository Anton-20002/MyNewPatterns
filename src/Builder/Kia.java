package Builder;

/**
 * Created by Anton on 20.03.2018.
 */
public class Kia extends CarBuilder {
    public Kia() { super();}

    @Override
    void setColour() {
        c.setColour("Black");
    }

    @Override
    void setSpeed() { c.setSpeed(200);}



}
