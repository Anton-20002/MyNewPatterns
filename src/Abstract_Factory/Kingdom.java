package Abstract_Factory;

/**
 * Created by Anton on 11.06.2018.
 */
public class Kingdom {
    private King king;
    private Army army;
    KingdomFactory factory;

    public  KingdomFactory makeFactory(KingdomType type){
            switch (type){
                case ELF:
                    return
                    this.factory = new ElfKingdomFactory();

                case ORC:
                     this.factory = new OrcKingdomFactory();

                default:
                    throw new IllegalArgumentException("Kim");
            }

    }

    public King getKing() {
        return king;
    }

    public void setKing() {
        this.king = factory.createKing();
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy() {
        this.army = factory.createArmy();
    }
}
