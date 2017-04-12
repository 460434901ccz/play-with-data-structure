package ccz.practise.playwithdatastructure.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by visionsky on 2017/4/7.
 */
public class SortTest {

    @Test
    public void testBubbleSort() {
        int[] array = new int[]{3, 1, 6, 5, 2, 7, 4, 9, 10, 8};

        Sort.bubbleSort(array);

        for(int i=0; i<array.length; i++) {
            Assert.assertEquals(i+1, array[i]);
        }
    }

    @Test
    public void testSimpleSelectionSort() {
        int[] array = new int[]{3, 1, 6, 5, 2, 7, 4, 9, 10, 8};

        Sort.simpleSelectionSort(array);

        for(int i=0; i<array.length; i++) {
            Assert.assertEquals(i+1, array[i]);
        }
    }

    @Test
    public void testStraightInsertionSort() {
        int[] array = new int[]{3, 1, 6, 5, 2, 7, 4, 9, 10, 8};

        Sort.straightInsertionSort(array);

        for(int i=0; i<array.length; i++) {
            Assert.assertEquals(i+1, array[i]);
        }
    }

    @Test
    public void testShellSort() {
        int[] array = new int[]{3, 1, 6, 5, 2, 7, 4, 9, 10, 8};

        Sort.shellSort(array);

        for(int i=0; i<array.length; i++) {
            Assert.assertEquals(i+1, array[i]);
        }
    }

    @Test
    public void testMergeSort() {
        int[] array = new int[]{3, 1, 6, 5, 2, 7, 4, 9, 10, 8};

        Sort.mergeSort(array);

        for(int i=0; i<array.length; i++) {
            Assert.assertEquals(i+1, array[i]);
        }
    }
}
