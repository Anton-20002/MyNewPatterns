package IteratorSimple;


public class App {
    public static void main(String[] args) {
        Container container = new Cont();
        Iter iter = container.iterator();
        while (iter.hasNext()){
            System.out.println((String)iter.next());
        }
    }
}
