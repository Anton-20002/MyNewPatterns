package Mediator;

/**
 * Created by Anton on 28.05.2018.
 */
public abstract class Battle {
    abstract void addMember(BattleMember battleMember);
    abstract void battleAction(BattleMember battleMember);
    abstract String name();
}
