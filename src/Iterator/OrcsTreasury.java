package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton on 21.06.2018.
 */
public class OrcsTreasury implements Treasury {
    @Override
    public Iterator iterator(ItemType type) {

        return new TreasuryIterator(this, type);
    }

    @Override
    public List<Item> getItems() {
        return orcItems;
    }

    private List <Item> orcItems;

    public OrcsTreasury() {
        this.orcItems = new ArrayList<>();
        orcItems.add(new Item(ItemType.GOLD, "Gold Coin"));
        orcItems.add(new Item(ItemType.GOLD, "Gold Ring"));
        orcItems.add(new Item(ItemType.GOLD, "Gold Earring"));
        orcItems.add(new Item(ItemType.WEAPON, "Orc Spear"));
        orcItems.add(new Item(ItemType.WEAPON, "Orc Hammer"));

    }

 }
