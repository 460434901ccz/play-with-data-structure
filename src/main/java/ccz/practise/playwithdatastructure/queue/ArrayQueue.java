package ccz.practise.playwithdatastructure.queue;

/**
 * Created by 46043 on 2017/4/4.
 */
public class ArrayQueue<T> implements Queue<T> {
    private static final Integer DEFAULT_INIT_SIZE = 10;

    private Object[] nodes;
    private int headIndex = 1;
    private int tailIndex = 0;
    private int size;

    public ArrayQueue() {
        this(DEFAULT_INIT_SIZE);
    }

    public ArrayQueue(int initSize) {
        nodes = new Object[initSize+2];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enQueue(T t) {
        if((headIndex+1)%nodes.length == tailIndex) {
            Object[] newNodes = new Object[nodes.length*2];
            if(headIndex>tailIndex) {
                System.arraycopy(nodes, tailIndex, newNodes, 0, headIndex-tailIndex+1);
            } else {
                System.arraycopy(nodes, tailIndex, newNodes, 0, nodes.length-tailIndex);
                System.arraycopy(nodes, 0, newNodes, nodes.length-tailIndex, headIndex+1);
            }
            headIndex = size()+1;
            tailIndex = 0;
            nodes = newNodes;
        }
        nodes[headIndex] = t;
        headIndex = (headIndex+1)%nodes.length;
        size++;
    }

    @Override
    public T deQueue() {
        if(size()==0) throw new IndexOutOfBoundsException();
        size--;
        return (T)nodes[++tailIndex];
    }



    @Override
    public void clear() {
        nodes = new Object[size()];
    }
}
