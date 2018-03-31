package FactoryMethod;

/**
 * Created by Anton on 20.03.2018.
 */
public class Airbus implements Actionable {
    @Override
    public void fly() {
        System.out.println("Airbus Flying...");
    }
}
