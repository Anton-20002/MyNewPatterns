package Iterator;

/**
 * Created by Anton on 21.06.2018.
 */
public class TreasuryIterator implements Iterator {
    private Treasury treasury;
    private ItemType type;
    private int id;

    public TreasuryIterator(Treasury treasury, ItemType type) {
        this.treasury = treasury;
        this.type = type;
        this.id = -1;
    }

    @Override
    public boolean hasNext() {
        return findId()!=-1;
    }

    @Override
    public boolean equalType() {
        return treasury.getItems().get(id).getType().equals(type);
    }

    private int findId() {
        int tempId=id;
        tempId++;
        if (tempId>=treasury.getItems().size()){
            //System.out.println(treasury.getItems().size());
            return tempId = -1;
        }
        this.id=tempId;
        return tempId;
    }

    @Override
    public Item nextItem() {
        return treasury.getItems().get(id);
    }
}
