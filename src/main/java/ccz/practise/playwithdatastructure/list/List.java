package ccz.practise.playwithdatastructure.list;

/**
 * Created by visionsky on 2017/4/1.
 */
public interface List<T> {

    boolean isEmpty();

    int size();

    void clear();

    void add(T t);

    void addAll(List<T> anotherList);

    T get(int index);

    void insert(T t, int index);

    int index(T t);

    void remove(int index);

}
