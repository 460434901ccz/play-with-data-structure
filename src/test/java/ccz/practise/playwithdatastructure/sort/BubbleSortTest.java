package ccz.practise.playwithdatastructure.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by visionsky on 2017/4/7.
 */
public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] array = new int[]{3, 1, 6, 5, 2, 7, 4, 9, 10, 8};

        BubbleSort.bubbleSort(array);

        for(int i=0; i<array.length; i++) {
            Assert.assertEquals(i+1, array[i]);
        }
    }
}
