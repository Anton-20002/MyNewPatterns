package Iterator;

import java.util.List;

/**
 * Created by Anton on 21.06.2018.
 */
public interface Treasury {
    Iterator iterator(ItemType type);
    List <Item> getItems();
}
