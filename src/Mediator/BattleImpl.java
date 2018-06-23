package Mediator;

import java.util.*;

/**
 * Created by Anton on 28.05.2018.
 */
public class BattleImpl extends Battle {
    private Deque<BattleMember> members = new ArrayDeque<>();
   // public String name;

    @Override
    void addMember(BattleMember battleMember) {
        members.add(battleMember);
        battleMember.joinBattle(this);
    }
    @Override
    void battleAction(BattleMember battleMember) {
        for (BattleMember bs : members) {
            if (bs.equals(battleMember)) {
                members.remove(bs);
                members.addFirst(bs);
            }
        }
            for (BattleMember bst : members) {
                if (bst.equals(battleMember)) {
                    bst.fight();
                }
                if (!bst.equals(battleMember)) {
                    bst.getDamage();
                }
            }
        }


        @Override
        public String name () {
            return "World War";
        }
    }
