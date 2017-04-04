package ccz.practise.playwithdatastructure.queue;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

/**
 * Created by 46043 on 2017/4/4.
 */
public class QueueTest {
    protected Queue<Object> queue = null;

    @After
    public void after() throws Exception {
        queue = null;
    }

    @Test
    public void testEnQueueAndDeQueue() {
        for(int i=0; i<20; i++) {
            queue.enQueue(i);
        }
        for(int i=0; i<20; i++) {
            assertEquals(i, queue.deQueue());
        }

    }

    @Test
    public void testSize() {
        for(int i=0; i<20; i++) {
            queue.enQueue(i);
            assertEquals(i+1, queue.size());
        }
        for(int i=0; i<20; i++) {
            queue.deQueue();
            assertEquals(20-(i+1), queue.size());
        }
    }
}
