package State;

/**
 * Created by Anton on 08.06.2018.
 */
public class Angry implements State {
//    String stateName;
    Orc orc;
    public Angry(Orc orc) {
        this.orc = orc;
//        stateName = "Orc is hungry";
//        System.out.println(stateName);
        System.out.println("Orc is hungry");
//        orc.state = this;
    }

    @Override

    public void perform() {
        orc.action(this);
//        System.out.println("Orc hunts the rabbit");
        orc.changeState();
    }
}
