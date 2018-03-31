package Builder;

/**
 * Created by Anton on 20.03.2018.
 */
public class Creator {
    CarBuilder cb;

    public void setCb(CarBuilder cb) {
        this.cb = cb;
    }
    Car build(){
        cb.createCar();
        cb.setColour();
        cb.setSpeed();
      return   cb.getC();
    }

}
