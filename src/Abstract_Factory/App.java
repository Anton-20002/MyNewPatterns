package Abstract_Factory;

/**
 * Created by Anton on 11.06.2018.
 */
public class App {
    public static void main(String[] args) {
        Kingdom kingdom = new Kingdom();
        kingdom.makeFactory(KingdomType.ELF);
        kingdom.setKing();
        kingdom.getKing().getDescription();
//        kingdom.setArmy();
//        kingdom.getArmy().getDescription();
    }
}
