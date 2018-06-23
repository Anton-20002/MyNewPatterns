package IteratorSimple;

/**
 * Created by Anton on 21.06.2018.
 */
public class Cont implements Container {
    public String[] tasks = {"task1", "task2", "task3"};

    public String[] getTasks() {
        return tasks;
    }

    @Override
    public Iter iterator() {
        return new ContainerIterator();
    }
}
