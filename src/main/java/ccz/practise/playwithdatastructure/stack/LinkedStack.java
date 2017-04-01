package ccz.practise.playwithdatastructure.stack;

import ccz.practise.playwithdatastructure.list.LinkedList;

import java.util.EmptyStackException;

/**
 * Created by visionsky on 2017/4/1.
 */
public class LinkedStack<T> implements Stack<T> {
    private TopNode topNode;
    private int size;

    public LinkedStack() {
        topNode = new TopNode(null, null);
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        final T data = topNode.next.data;
        size--;
        return data;
    }

    @Override
    public void push(T t) {
        topNode.next = new TopNode(t, topNode.next);
        size++;
    }

    @Override
    public T getTop() {
        if(isEmpty()) throw new EmptyStackException();
        return topNode.next.data;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private class TopNode {
        private T data;
        private TopNode next;

        private TopNode(T data, TopNode next) {
            this.data = data;
            this.next = next;
        }
    }
}
