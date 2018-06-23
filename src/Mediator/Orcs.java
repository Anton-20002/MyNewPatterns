package Mediator;

/**
 * Created by Anton on 28.05.2018.
 */
public class Orcs implements BattleMember {

    @Override
    public void joinBattle(Battle battle) {

        System.out.println("Orc joins the " + battle.name());
    }

    @Override
    public void fight() {
        System.out.println("Orc spears the enemy");
    }

    @Override
    public void getDamage() {
        System.out.println("Orc is wounded");
    }
}
