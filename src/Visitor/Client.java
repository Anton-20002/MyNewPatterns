package Visitor;

/**
 * Created by Anton on 17.04.2018.
 */
public class Client {
    public static void main(String[] args) {
        Printable report = new DailyReport();
        Visitor manager = new Manager1();
        report.printReport(manager);
    }
}
