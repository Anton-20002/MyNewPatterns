package Iterator;

/**
 * Created by Anton on 21.06.2018.
 */
public class Item {
    private ItemType type;
    private String name;

    public Item(ItemType type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    public ItemType getType(){return type;}
}
