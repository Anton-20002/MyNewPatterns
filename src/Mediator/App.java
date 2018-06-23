package Mediator;

/**
 * Created by Anton on 28.05.2018.
 */
public class App {
    public static void main(String[] args) {
        Battle battle = new BattleImpl();
        BattleMember elf = new Elf();
        BattleMember orc = new Orcs();
        BattleMember dwarf = new Dwarf();
        battle.addMember(elf);
        battle.addMember(orc);
        battle.addMember(dwarf);
        battle.battleAction(orc);
    }
}
