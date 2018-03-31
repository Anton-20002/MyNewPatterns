package Chain;

/**
 * Created by Anton on 21.03.2018.
 */
public class Vagon2 extends Chain {

    public void setCh() {
        super.setCh(ch);
    }

    @Override
    void action() {
        System.out.println("Vagon2 running...");
    }
}
