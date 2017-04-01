package ccz.practise.playwithdatastructure.list;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * ArrayList Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 1, 2017</pre>
 */
public class ListTest {
    protected List<Object> list = null;



    /**
     * Method: isEmpty()
     */
    @Test
    public void testIsEmpty() throws Exception {
        assertEquals(true, list.isEmpty());
        list.add(new Object());
        assertEquals(false, list.isEmpty());
    }

    /**
     * Method: size()
     */
    @Test
    public void testSize() throws Exception {
        assertEquals(0, list.size());
    }

    /**
     * Method: clear()
     */
    @Test
    public void testClear() throws Exception {
        list.add(new Object());
        assertEquals(false, list.isEmpty());
        assertEquals(1, list.size());
        list.clear();
        assertEquals(true, list.isEmpty());
        assertEquals(0, list.size());
    }

    /**
     * Method: add(T o)
     */
    @Test
    public void testAddAndGet() throws Exception {
        Integer i = 1;
        list.add(i);
        assertEquals(1, list.get(0));
    }

    /**
     * Method: addAll(List<T> anotherList)
     */
    @Test
    public void testAddAll() throws Exception {

    }

    /**
     * Method: insert(T t, int index)
     */
    @Test
    public void testInsert() throws Exception {
        list.insert(0, 0);
        assertEquals(0, list.get(0));

        list.clear();

        list.add(0);
        list.insert(1, 1);
        assertEquals(1, list.get(1));

        list.clear();

        list.add(0);
        list.add(1);
        list.insert(2, 1);
        assertEquals(2, list.get(1));
        assertEquals(1, list.get(2));
    }

    /**
     * Method: index(T t)
     */
    @Test
    public void testIndex() throws Exception {
        list.add(0);
        list.add(1);
        list.add(2);
        Assert.assertEquals(0, list.get(0));
        Assert.assertEquals(1, list.get(1));
        Assert.assertEquals(2, list.get(2));
    }

    /**
     * Method: remove(int index)
     */
    @Test
    public void testRemove() throws Exception {
        list.add(0);
        list.add(1);
        list.add(2);
        list.remove(0);
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));

        list.clear();

        list.add(0);
        list.add(1);
        list.add(2);
        list.remove(1);
        assertEquals(2, list.size());
        assertEquals(2, list.get(1));

        list.clear();

        list.add(0);
        list.add(1);
        list.add(2);

        list.remove(2);
        assertEquals(2, list.size());
    }

} 
