package Visitor;

/**
 * Created by Anton on 17.04.2018.
 */
public class SalesReport implements Printable{
    @Override
    public void printReport(Visitor person) {
        person.print(this);
    }
}
