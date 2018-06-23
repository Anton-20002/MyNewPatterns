package Memento;

/**
 * Created by Anton on 17.04.2018.
 */
public class MementoCatch {
    int par1;

    public MementoCatch(int par1) {
        this.par1 = par1;
    }

    Memento setCatch(){return new Memento(par1);}
    void getCatch(Memento m){this.par1=m.getPar1();}
}
