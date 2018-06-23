package Visitor;

/**
 * Created by Anton on 17.04.2018.
 */
public class Manager1 implements Visitor {
    @Override
    public void print(SalesReport sr) {
        System.out.println("Sales report of Manager1...");
    }

    @Override
    public void print(DailyReport dr) {
        System.out.println("Daily report of Manager1...");
    }
}
