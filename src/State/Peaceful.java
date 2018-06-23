package State;

/**
 * Created by Anton on 08.06.2018.
 */
public class Peaceful implements State {
//    String stateName;
    Orc orc;
    Peaceful(Orc orc){
//        stateName = "The Orc is calm and peaceful";
//        System.out.println(stateName);
        this.orc = orc;
        System.out.println("The Orc is calm and peaceful");
    }
    @Override
    public void perform() {
        orc.action(this);
//        System.out.println("Orc lien on the Sun");
        orc.changeState();
    }
}
