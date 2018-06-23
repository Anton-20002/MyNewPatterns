package Memento;

/**
 * Created by Anton on 17.04.2018.
 */
public class Client {
    public static void main(String[] args) {
    int par1 = 0;

//    action
//    .............
//    catch param
        MementoCatch mc = new MementoCatch(par1);
        MementoKeeper mk = new MementoKeeper();
        mk.setM(mc.setCatch());
// .................
//        ''''''''''
        mc.getCatch(mk.getM());
    }
}
