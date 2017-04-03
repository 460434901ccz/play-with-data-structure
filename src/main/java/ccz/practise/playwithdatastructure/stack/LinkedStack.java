package ccz.practise.playwithdatastructure.stack;

import ccz.practise.playwithdatastructure.list.LinkedList;

import java.util.EmptyStackException;

/**
 * Created by visionsky on 2017/4/1.
 */
public class LinkedStack<T> implements Stack<T> {
    private LinkedList<T> linkedList;

    public LinkedStack() {
        linkedList = new LinkedList();
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public T pop() {
        T t = getTop();
        linkedList.remove(size()-1);
        return t;
    }

    @Override
    public void push(T t) {
        linkedList.add(t);
    }

    @Override
    public T getTop() {
        return linkedList.get(size()-1);
    }

    @Override
    public void clear() {
        linkedList = new LinkedList();
    }

    @Override
    public int size() {
        return linkedList.size();
    }

}
