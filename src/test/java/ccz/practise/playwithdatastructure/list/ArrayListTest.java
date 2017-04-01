package ccz.practise.playwithdatastructure.list;

import org.junit.After;
import org.junit.Before;

/**
 * Created by visionsky on 2017/4/1.
 */
public class ArrayListTest extends ListTest {

    @Before
    public void before() throws Exception {
        list = new ArrayList();
    }

    @After
    public void after() throws Exception {
        list = null;
    }
}
