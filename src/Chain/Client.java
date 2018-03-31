package Chain;

/**
 * Created by Anton on 21.03.2018.
 */
public class Client {
    public static void main(String[] args) {

        Chain c = new Vagon1();
        Chain i = new Vagon2();
        Chain p = new Vagon3();

        c.setCh(i);
        p.setCh(c);

        p.getCh();
    }
}
