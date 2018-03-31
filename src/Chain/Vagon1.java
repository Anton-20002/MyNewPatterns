package Chain;

/**
 * Created by Anton on 21.03.2018.
 */
public class Vagon1 extends Chain {

    public void setCh() {
        super.setCh(ch);
    }

    @Override
    void action() {
        System.out.println("Vago1 running...");
    }
}
