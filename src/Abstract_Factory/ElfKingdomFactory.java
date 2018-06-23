package Abstract_Factory;

/**
 * Created by Anton on 11.06.2018.
 */
public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
