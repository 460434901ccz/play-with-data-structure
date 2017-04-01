package ccz.practise.playwithdatastructure.stack;

/**
 * Created by visionsky on 2017/4/1.
 */
public interface Stack<T> {
    T pop();
    void push(T t);
    T getTop();
    void clear();
    int size();
}
