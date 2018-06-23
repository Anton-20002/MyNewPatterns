package State;

/**
 * Created by Anton on 08.06.2018.
 */
public class Orc {
    //    State state = new Peaceful(this);
    State state;

    public Orc() {
        state = new Peaceful(this);
        state.perform();

    }
    public void timePass(){
        state.perform();
    }
    public void changeState(){
        if (state.getClass().equals(Peaceful.class)){
            setState(new Angry(this));
        } else {
            setState(new Peaceful(this));
        }
    }
    public void setState(State newState){
        this.state = newState;
    }
    public void action(State state){
        this.state = state;
        if (state.getClass().equals(Angry.class)) {
            System.out.println("Orc hunts the rabbit");
        }
        if (state.getClass().equals(Peaceful.class)){
            System.out.println("Orc lies on the Sun");
        }
    }
}
