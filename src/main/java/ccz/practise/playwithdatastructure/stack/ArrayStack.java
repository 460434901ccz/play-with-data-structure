package ccz.practise.playwithdatastructure.stack;

import java.util.EmptyStackException;

/**
 * Created by visionsky on 2017/4/1.
 */
public class ArrayStack<T> implements Stack<T> {
    private static final Integer DEFAULT_INIT_SIZE = 10;

    private Object[] nodes = null;
    private int size;

    public ArrayStack() {
        this(DEFAULT_INIT_SIZE);
    }

    public ArrayStack(int initSize) {
        nodes = new Object[initSize];
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        T t = (T)nodes[size-1];
        size--;
        return t;
    }

    @Override
    public void push(T t) {
        increase();
        nodes[size++] = t;
    }

    @Override
    public T getTop() {
        if(isEmpty()) throw new EmptyStackException();
        return (T)nodes[size-1];
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void increase() {
        if(size() == nodes.length) {
            Object[] newNodes = new Object[nodes.length * 2];
            System.arraycopy(nodes, 0, newNodes, 0, nodes.length);
            nodes = newNodes;
        }
    }
}
