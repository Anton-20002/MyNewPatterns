package Builder;

/**
 * Created by Anton on 20.03.2018.
 */
public class Ford extends CarBuilder{

    @Override
    void setColour() {
        System.out.println("RED");
    }

    @Override
    void setSpeed() {
        System.out.println("200");
    }
}
