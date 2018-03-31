package FactoryMethod;

/**
 * Created by Anton on 20.03.2018.
 */
public class AirBuilder {
    Actionable a;
  public Actionable getActionable(String air) {
        if (air == "airbus") {
            return a = new Airbus();}
        if (air == "boeing") {
                return a =  new Boeing();}
        return null;
            }
}
