package ccz.practise.playwithdatastructure.list;

/**
 * Created by visionsky on 2017/4/1.
 */
public class ArrayList<T> implements List<T> {

    private final Integer DEFAULT_INIT_SIZE = 10;
    private Object[] nodes;
    private int size;

    public ArrayList() {
        nodes = new Object[DEFAULT_INIT_SIZE];
    }

    public ArrayList(int initSize) {
        nodes = new Object[initSize];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        nodes = new Object[nodes.length];
        size = 0;
    }

    @Override
    public void add(T o) {
        increase();
        nodes[size++] = o;
    }

    @Override
    public void addAll(List<T> anotherList) {
        for(int i=0; i<anotherList.size(); i++) {
            this.add(anotherList.get(i));
        }
    }

    @Override
    public T get(int index) {
        if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
        return (T) nodes[index];
    }

    @Override
    public void insert(T t, int index) {
        if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
        increase();
        for(int i=size(); i>index; i--) nodes[i] = nodes[i-1];
        nodes[index] = t;
        size++;
    }

    private void increase() {
        if(size() == nodes.length) {
            Object[] newNodes = new Object[nodes.length * 2];
            System.arraycopy(nodes, 0, newNodes, 0, nodes.length);
            nodes = newNodes;
        }
    }

    @Override
    public int index(T t) {
        for(int i=0; i<size(); i++) {
            if(t.equals(get(i))) return i;
        }
        return -1;
    }

    @Override
    public void remove(int index) {
        if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
        for(int i=index; i<size()-1; i++) {
            nodes[index] = nodes[index+1];
        }
        size--;
    }
}
