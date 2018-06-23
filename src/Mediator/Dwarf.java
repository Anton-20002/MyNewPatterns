package Mediator;

/**
 * Created by Anton on 28.05.2018.
 */
public class Dwarf implements BattleMember {
    @Override
    public void joinBattle(Battle battle) {
        System.out.println("Dwarf joins the "+ battle.name());
    }

    @Override
    public void fight() {
        System.out.println("Dwarf strikes the enemy");
    }

    @Override
    public void getDamage() {
        System.out.println("Dwarf is wounded");
    }
}
