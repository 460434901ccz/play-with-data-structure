package ccz.practise.playwithdatastructure.stack;

import ccz.practise.playwithdatastructure.list.ArrayList;

import java.util.EmptyStackException;

/**
 * Created by visionsky on 2017/4/1.
 */
public class ArrayStack<T> implements Stack<T> {
    private static final Integer DEFAULT_INIT_SIZE = 10;

    private ArrayList<T> arrayList;

    public ArrayStack() {
        this(DEFAULT_INIT_SIZE);
    }

    public ArrayStack(int initSize) {
        arrayList = new ArrayList<T>(DEFAULT_INIT_SIZE);
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public T pop() {
        T t = getTop();
        arrayList.remove(size()-1);
        return t;
    }

    @Override
    public void push(T t) {
        arrayList.add(t);
    }

    @Override
    public T getTop() {
        if(isEmpty()) throw new EmptyStackException();
        return arrayList.get(size()-1);
    }

    @Override
    public void clear() {
        arrayList = new ArrayList<T>(arrayList.size());
    }

    @Override
    public int size() {
        return arrayList.size();
    }

}
