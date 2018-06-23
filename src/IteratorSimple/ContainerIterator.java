package IteratorSimple;

/**
 * Created by Anton on 21.06.2018.
 */
public class ContainerIterator implements Iter {
    int index;
    Cont c;
    public ContainerIterator() {
        this.c = new Cont();
    }

    @Override
    public boolean hasNext() {
        return (index < c.getTasks().length);
    }

    @Override
    public Object next() {
        return c.tasks[index++];
    }
}
