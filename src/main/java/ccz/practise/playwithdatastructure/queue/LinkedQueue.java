package ccz.practise.playwithdatastructure.queue;

import ccz.practise.playwithdatastructure.list.LinkedList;

/**
 * Created by 46043 on 2017/4/4.
 */
public class LinkedQueue<T> implements Queue<T> {
    private LinkedList<T> list;

    public LinkedQueue() {
        list = new LinkedList();
    }

    @Override
    public void enQueue(T t) {
        list.add(t);
    }

    @Override
    public T deQueue() {
        T t = list.get(0);
        list.remove(0);
        return t;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void clear() {
        list = new LinkedList<>();
    }
}
