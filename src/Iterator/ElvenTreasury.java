package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton on 21.06.2018.
 */
public class ElvenTreasury implements Treasury {
    @Override
    public Iterator iterator(ItemType type) {
        return new TreasuryIterator(this,type);
    }

    @Override
    public List<Item> getItems() {
        return elfItems;
    }

    private List <Item> elfItems;

    public ElvenTreasury() {
        this.elfItems = new ArrayList<>();
        elfItems.add(new Item(ItemType.GOLD, "Elven Dedoration"));
        elfItems.add(new Item(ItemType.WEAPON, "Elven Bow"));
        elfItems.add(new Item(ItemType.WEAPON, "Elven Arrow"));

    }

}
