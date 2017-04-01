package ccz.practise.playwithdatastructure.stack;

import org.junit.After;
import org.junit.Before;

/**
 * Created by visionsky on 2017/4/1.
 */
public class ArrayStackTest extends StackTest {

    @Before
    public void before() throws Exception {
        stack = new ArrayStack<>();
    }

    @After
    public void after() throws Exception {
        stack = null;
    }
}
