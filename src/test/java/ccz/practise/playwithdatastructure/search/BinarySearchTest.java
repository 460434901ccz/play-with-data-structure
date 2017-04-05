package ccz.practise.playwithdatastructure.search;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by visionsky on 2017/4/5.
 */
public class BinarySearchTest {
    @Test
    public void testBinarySearch() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertEquals(-1, BinarySearch.binarySearch(array, -2));
        Assert.assertEquals(0, BinarySearch.binarySearch(array, 1));
        Assert.assertEquals(1, BinarySearch.binarySearch(array, 2));
        Assert.assertEquals(2, BinarySearch.binarySearch(array, 3));
        Assert.assertEquals(8, BinarySearch.binarySearch(array, 9));
        Assert.assertEquals(-1, BinarySearch.binarySearch(array, 11));

        array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertEquals(-1, BinarySearch.binarySearch(array, -2));
        Assert.assertEquals(0, BinarySearch.binarySearch(array, 1));
        Assert.assertEquals(1, BinarySearch.binarySearch(array, 2));
        Assert.assertEquals(2, BinarySearch.binarySearch(array, 3));
        Assert.assertEquals(8, BinarySearch.binarySearch(array, 9));
        Assert.assertEquals(-1, BinarySearch.binarySearch(array, 11));
    }
}
