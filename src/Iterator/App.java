package Iterator;

/**
 * Created by Anton on 21.06.2018.
 */
public class App {
    public static void main(String[] args) {
        Treasury treasury = new ElvenTreasury();
        Iterator iterator = treasury.iterator(ItemType.WEAPON);
        while (iterator.hasNext()){
            if (iterator.equalType()) { System.out.println(iterator.nextItem().toString());}
            }
    }
}
