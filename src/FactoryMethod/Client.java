package FactoryMethod;

/**
 * Created by Anton on 21.03.2018.
 */
public class Client {
    public static void main(String[] args) {


        AirBuilder a = new AirBuilder();
        Actionable act = a.getActionable("boeing");
        act.fly();
    }


}
