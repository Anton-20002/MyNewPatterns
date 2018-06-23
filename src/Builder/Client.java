package Builder;

/**
 * Created by Anton on 20.03.2018.
 */
public class Client {
    public static void main(String[] args) {
        Creator cr = new Creator();
        cr.setCb(new Ford());
        Car car = cr.build();
        System.out.println(car.getSpeed());
        System.out.println(car.getColour());
    }
}
