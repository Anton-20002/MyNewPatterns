package Facade;

/**
 * Created by Anton on 30.03.2018.
 */
public class Client {

        private Rabbit r = new Rabbit();
        private Wolf w = new Wolf();
        private Owl o = new Owl();

       public void go(){
            r.Run();
            o.fly();
            w.jump();
        }


}
