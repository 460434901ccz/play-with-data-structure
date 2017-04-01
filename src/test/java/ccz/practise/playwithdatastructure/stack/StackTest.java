package ccz.practise.playwithdatastructure.stack;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * ArrayStack Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 1, 2017</pre>
 */
public class StackTest {
    protected Stack stack;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: isEmpty()
     */
    @Test
    public void testIsEmpty() throws Exception {
        assertEquals(true, stack.isEmpty());
        stack.push(new Object());
        assertEquals(false, stack.isEmpty());
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    /**
     * Method: pop()
     */
    @Test
    public void testPopAndPush() throws Exception {
        assertEquals(0, stack.size());
        stack.push(1);
        assertEquals(1, stack.size());
        Integer obj = (Integer)stack.pop();
        assertEquals(Integer.valueOf(1), obj);
        assertEquals(0, stack.size());
    }

    /**
     * Method: getTop()
     */
    @Test
    public void testGetTop() throws Exception {
        stack.push(1);
        assertEquals(Integer.valueOf(1), stack.getTop());
        assertEquals(1, stack.size());
    }

    /**
     * Method: clear()
     */
    @Test
    public void testClear() throws Exception {
        stack.push(new Object());
        assertEquals(1, stack.size());
        stack.clear();
        assertEquals(0, stack.size());
        assertEquals(true, stack.isEmpty());
    }

    /**
     * Method: size()
     */
    @Test
    public void testSize() throws Exception {
        assertEquals(0, stack.size());
        stack.push(new Object());
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }

} 
