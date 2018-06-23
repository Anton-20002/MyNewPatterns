package Visitor;

/**
 * Created by Anton on 17.04.2018.
 */
public interface Visitor {
    void print (SalesReport sr);

    void print (DailyReport dr);
}
