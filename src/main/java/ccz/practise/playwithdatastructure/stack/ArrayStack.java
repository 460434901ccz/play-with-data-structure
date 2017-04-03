package ccz.practise.playwithdatastructure.stack;

import ccz.practise.playwithdatastructure.list.ArrayList;

import java.util.EmptyStackException;

/**
 * Created by visionsky on 2017/4/1.
 */
public class ArrayStack<T> implements Stack<T> {
    private static final Integer DEFAULT_INIT_SIZE = 10;

    private ArrayList<T> arryList;

    public ArrayStack() {
        this(DEFAULT_INIT_SIZE);
    }

    public ArrayStack(int initSize) {
        arryList = new ArrayList<T>(DEFAULT_INIT_SIZE);
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public T pop() {
        T t = getTop();
        arryList.remove(size()-1);
        return t;
    }

    @Override
    public void push(T t) {
        arryList.add(t);
    }

    @Override
    public T getTop() {
        if(isEmpty()) throw new EmptyStackException();
        return arryList.get(size()-1);
    }

    @Override
    public void clear() {
        arryList = new ArrayList<T>(arryList.size());
    }

    @Override
    public int size() {
        return arryList.size();
    }

}
