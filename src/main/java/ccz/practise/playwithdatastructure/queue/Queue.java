package ccz.practise.playwithdatastructure.queue;

/**
 * Created by 46043 on 2017/4/4.
 */
public interface Queue<T> {
    void enQueue(T t);

    T deQueue();

    int size();

    void clear();


}
