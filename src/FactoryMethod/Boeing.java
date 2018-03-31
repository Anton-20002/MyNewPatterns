package FactoryMethod;

/**
 * Created by Anton on 20.03.2018.
 */
public class Boeing implements Actionable{
    @Override
    public void fly() {
        System.out.println("Boeng flying...");
    }
}
