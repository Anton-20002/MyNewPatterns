package Chain;

/**
 * Created by Anton on 21.03.2018.
 */
public abstract class Chain {
    Chain ch;
    public void setCh(Chain ch) {
        this.ch = ch;
    }
    abstract void action();
    void getCh(){
        action();
        if (ch!=null){ ch.getCh(); }
    }
}

