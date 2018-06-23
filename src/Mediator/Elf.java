package Mediator;

/**
 * Created by Anton on 28.05.2018.
 */
public class Elf implements BattleMember {
    @Override
    public void joinBattle(Battle battle) {
        System.out.println("Elf joins the "+ battle.name());
    }

    @Override
    public void fight() {
        System.out.println("Elf shoot the enemy");
    }

    @Override
    public void getDamage() {
        System.out.println("Elf is wounded");
    }
}
