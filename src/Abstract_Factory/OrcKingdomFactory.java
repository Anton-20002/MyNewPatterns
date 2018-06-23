package Abstract_Factory;

/**
 * Created by Anton on 11.06.2018.
 */
public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
